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
    //function to ge the HTTP rEQUEST
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }


    @PostMapping
    public ResponseEntity<String> RegisterNewStudent(@RequestBody Student student)
    {
       try {
           studentService.addNewStudent(student);
        return new ResponseEntity<>("Student created successfully", HttpStatus.CREATED);
    }
    catch (IllegalStateException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

}
}

@DeleteMapping(path= "{studentId}")
public ResponseEntity<String> DeleteStudent(@PathVariable("studentId") Long studentId)
{
    try
    {
    studentService.DeleteStudentSelected(studentId);
    return new ResponseEntity<>("", HttpStatus.CREATED);

}
    catch(IllegalStateException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

}


    //PUT Request

    @PutMapping(path= "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email)
    {

        studentService.updatatheStudent(studentId,name,email);

    }

}
