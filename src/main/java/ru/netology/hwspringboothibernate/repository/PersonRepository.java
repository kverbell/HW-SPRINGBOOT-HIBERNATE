package ru.netology.hwspringboothibernate.repository;

import ru.netology.hwspringboothibernate.entity.Person;
import ru.netology.hwspringboothibernate.entity.PersonId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, PersonId> {

    List<Person> findByCityOfLiving(String city);

    @Query("SELECT p FROM Person p WHERE p.age < :age ORDER BY p.age ASC")
    List<Person> findByAgeLessThanOrderByAgeAsc(@Param("age") int age);

    Optional<Person> findByNameAndSurname(String name, String surname);
}
