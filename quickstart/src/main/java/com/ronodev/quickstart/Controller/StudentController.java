package com.ronodev.quickstart.Controller;

import com.ronodev.quickstart.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController (StudentService studentService)
    {
        this.studentService = studentService;

    }


    @GetMapping
    //function to h=ge the HTTP rEQUEST
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }

}
