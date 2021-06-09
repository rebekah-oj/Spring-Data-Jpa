package com.spring.Spring.Jpa.service;

import com.spring.Spring.Jpa.entity.Student;
import com.spring.Spring.Jpa.repository.StudentRepository;
import com.spring.Spring.Jpa.request.StudentRequest;
import com.spring.Spring.Jpa.request.UpdateStudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(StudentRequest studentRequest) {
        Student student = new Student(studentRequest);

        student = studentRepository.save(student);
        return student;
    }

    public Student updateStudent(UpdateStudentRequest updateStudentRequest) {
        Student student = studentRepository.findById(updateStudentRequest.getId()).get();
        if (updateStudentRequest.getFirstName() != null && !updateStudentRequest.getFirstName().isEmpty()) {

            student.setFirstName(updateStudentRequest.getFirstName());
        }
        student = studentRepository.save(student);
        return student;
    }

    public String deleteStudent(long id) {
        studentRepository.deleteById(id);
        return "Student has been deleted successfully";
    }

    public List<Student> getByFirstName(String firstName){
        return studentRepository.findByFirstName(firstName);
    }
}
