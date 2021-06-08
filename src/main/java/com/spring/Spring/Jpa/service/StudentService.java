package com.spring.Spring.Jpa.service;

import com.spring.Spring.Jpa.entity.Student;
import com.spring.Spring.Jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
       return studentRepository.findAll();
    }
}
