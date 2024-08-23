package com.ronodev.quickstart.Service;

import com.ronodev.quickstart.Model.Student;
import com.ronodev.quickstart.Repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents()
    {
        return studentRepository.findAll();

    }


    public void addNewStudent(Student student)
    {
        Optional<Student> studentOptional = studentRepository
                .findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent())
        {
            throw new IllegalStateException("Email Taken");
        }
// Save the student to the database
        studentRepository.save(student);

    }

    public void DeleteStudentSelected(Long studentId)
    {
        //chec if the student exists
        boolean exists =studentRepository.existsById(studentId);
        if (!exists)
        {
            throw new IllegalStateException("Student with Id" + studentId + "is not in Db");
        }
        else
        {
            studentRepository.deleteById(studentId)

            ;
        }


    }


    @Transactional
    public void updatatheStudent(Long studentId,String name, String email) {

        Student student=studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("Student with Id: " + studentId + "do not exist"));
        if(name != null && !name.isEmpty() && !Objects.equals(student.getEmail(),name)) {
            student.setName(name);

        }
        if(email != null && !email.isEmpty() && !Objects.equals(student.getEmail(),email)) {
            Optional<Student> studentOptional=studentRepository.findStudentByEmail(email);
            if(studentOptional.isPresent())
            {
                throw new IllegalStateException("Email Taken");
            }

            student.setEmail(email);

        }
    }


}



