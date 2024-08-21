package com.ronodev.quickstart.Model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator
            (name = "student_sequence", sequenceName = "student_sequence",allocationSize = 1)

    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "student_sequence")

    public long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {

    }



    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
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
