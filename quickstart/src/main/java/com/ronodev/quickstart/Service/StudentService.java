package com.ronodev.quickstart.Service;

import com.ronodev.quickstart.Model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class StudentService {

    public List<Student> getStudents()
    {
        return List.of(

                new Student(
                        "rono@gmail.com",
                        LocalDate.of(2000, Month.OCTOBER, 18),21)
        );

    }
}
