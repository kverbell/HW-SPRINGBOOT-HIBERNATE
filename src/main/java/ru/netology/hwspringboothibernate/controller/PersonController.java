package ru.netology.hwspringboothibernate.controller;

import ru.netology.hwspringboothibernate.entity.Person;
import ru.netology.hwspringboothibernate.entity.PersonId;
import ru.netology.hwspringboothibernate.repository.PersonRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personRepository.findByCityOfLiving(city);
    }

    @GetMapping("/by-age")
    public List<Person> getPersonsByAge(@RequestParam int age) {
        return personRepository.findByAgeLessThanOrderByAgeAsc(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Person> getPersonByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return personRepository.findByNameAndSurname(name, surname);
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @PutMapping
    public Person updatePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @DeleteMapping
    public void deletePerson(@RequestBody PersonId personId) {
        personRepository.deleteById(personId);
    }
}
