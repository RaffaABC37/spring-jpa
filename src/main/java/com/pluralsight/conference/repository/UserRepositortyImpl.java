//package com.pluralsight.conference.repository;
//
//import com.pluralsight.conference.model.User;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class UserRepositortyImpl implements UserRepository{
//
//  @PersistenceContext
//  private EntityManager entityManager;
//
//  @Override
//  public User save(User user) {
//    entityManager.persist(user);
//    return user;
//  }
//}
