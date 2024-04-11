package com.dev.crudmysql.controller;

import com.dev.crudmysql.entity.Student;
import com.dev.crudmysql.service.StudentService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    // Inyección de dependencia del servicio StudentService
    @Autowired
    private StudentService studentService;
    
    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }
    
    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable("id") Long id){
        return studentService.getStudent(id);
    }
    
    @PostMapping
    public Student saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student;
    }
    
    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable("studentId") Long studentId){
        studentService.delete(studentId);
    }
}
