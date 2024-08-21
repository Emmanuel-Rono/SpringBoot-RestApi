package com.ronodev.quickstart.Controller;

import com.ronodev.quickstart.Model.Student;
import com.ronodev.quickstart.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<String> RegisterNewStudent(@RequestBody Student student)
    {
        studentService.addNewStudent(student);
        return new ResponseEntity<>("Student created successfully", HttpStatus.CREATED);

    }

}
