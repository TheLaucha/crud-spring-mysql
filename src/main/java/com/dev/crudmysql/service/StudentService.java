package com.dev.crudmysql.service;

import com.dev.crudmysql.entity.Student;
import com.dev.crudmysql.repository.StudentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Anotación que indica que esta clase es un componente de servicio en Spring
@Service
public class StudentService {
    // Inyección de dependencia del repositorio StudentRepository
    @Autowired
    StudentRepository studentRepository;
    
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    
    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }
    
    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }
    
    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
