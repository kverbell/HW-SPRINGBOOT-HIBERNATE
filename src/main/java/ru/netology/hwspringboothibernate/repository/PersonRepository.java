package ru.netology.hwspringboothibernate.repository;

import ru.netology.hwspringboothibernate.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> findByCityOfLiving(String city) {
        String jpql = "SELECT p FROM Person p WHERE p.cityOfLiving = :city";
        TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
        query.setParameter("city", city);
        return query.getResultList();
    }
}
