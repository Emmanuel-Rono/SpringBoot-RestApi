package com.ronodev.quickstart.Controller;

import java.time.LocalDate;

public class Student {

    public long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student(String email, LocalDate dob, Integer age) {
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
