//package com.pluralsight.conference.repository;
//
//import com.pluralsight.conference.model.Registration;
//import com.pluralsight.conference.model.RegistrationReport;
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class RegistrationRepositoryImpl implements RegistrationRepository{
//
//  @PersistenceContext
//  private EntityManager entityManager;
//
//  @Override
//  public Registration save(Registration registration) {
//    if (registration.getId() == null) {
//      entityManager.persist(registration);
//    } else {
//      entityManager.merge(registration);
//    }
//    return registration;
//  }
//
//  @Override
//  public List<Registration> findAll() {
//    List<Registration> registrations = entityManager.createQuery("select r from Registration r").getResultList();
//    return registrations;
//  }
//
//  @Override
//  public List<RegistrationReport> findAllReports() {
////    String jpql = "select new com.pluralsight.conference.model.RegistrationReport "
////        + "(r.name, c.name, c.description)"
////        + " from Registration r, Course c "
////        + "where r.id = c.registration.id";
////    List<RegistrationReport> registrationReports = entityManager.createQuery(jpql).getResultList();
//    List<RegistrationReport> registrationReports = entityManager.createNamedQuery(Registration.REGISTRATION_REPORT).getResultList();
//    return registrationReports;
//  }
//}
