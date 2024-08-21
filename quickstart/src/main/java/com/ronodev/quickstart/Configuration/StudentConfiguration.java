package com.ronodev.quickstart.Configuration;

import com.ronodev.quickstart.Model.Student;
import com.ronodev.quickstart.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration

public class StudentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {

          Student Rop = new Student(
                    "John John",
                "john@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 18),21);

            Student rigi = new Student(
                    "John Doe",
                    "joe@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 18),21);

            repository.saveAll(List.of(Rop,rigi));
        };


        }

    }


