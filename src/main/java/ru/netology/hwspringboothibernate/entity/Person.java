package ru.netology.hwspringboothibernate.entity;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@IdClass(PersonId.class)
public class Person {

    @Id
    @Column(length = 50)
    private String name;

    @Id
    @Column(length = 50)
    private String surname;

    @Id
    private int age;

    @Column(length = 15)
    private String phoneNumber;

    @Column(length = 50)
    private String cityOfLiving;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }
}
