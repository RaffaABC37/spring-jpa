package com.pluralsight.conference.service;

import com.pluralsight.conference.model.Course;
import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.RegistrationReport;
import com.pluralsight.conference.repository.CourseRepository;
import com.pluralsight.conference.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import org.springframework.util.StringUtils;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;
    @Autowired
    private CourseRepository courseRepository;


    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {

        if(StringUtils.isEmpty(registration.getId())) {
            Course course = new Course();
            course.setName("Intro");
            course.setDescription("Every attendee must complete the intro.");
            course.setRegistration(registration);

            courseRepository.save(course);
        }
        registration = registrationRepository.save(registration);
        return registration;
    }

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public List<RegistrationReport> findAllReports() {
//        return registrationRepository.findAllReports();
        return registrationRepository.registrationReport();

    }

}
