package ru.netology.hwspringboothibernate.repository;

import ru.netology.hwspringboothibernate.entity.Person;
import ru.netology.hwspringboothibernate.entity.PersonId;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonId> {
    List<Person> findByCityOfLiving(String city);
}
