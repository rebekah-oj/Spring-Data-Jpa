package com.spring.Spring.Jpa.controller;

import com.spring.Spring.Jpa.entity.Student;
import com.spring.Spring.Jpa.request.StudentRequest;
import com.spring.Spring.Jpa.request.UpdateStudentRequest;
import com.spring.Spring.Jpa.response.StudentResponse;
import com.spring.Spring.Jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("getAll")
    public List<StudentResponse> getAllStudents() {

        List<Student> studentList = studentService.getAllStudents();
        List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();

        studentList.stream().forEach(student -> {
            studentResponseList.add(new StudentResponse(student));
        });
        return studentResponseList;
    }

    @PostMapping("create")
    public StudentResponse createStudent(@Valid @RequestBody StudentRequest studentRequest) {
        Student student = studentService.createStudent(studentRequest);

        return new StudentResponse(student);
    }

    @PutMapping("update")
    public StudentResponse updateStudent(@Valid @RequestBody UpdateStudentRequest updateStudentRequest) {
          Student student = studentService.updateStudent(updateStudentRequest);

          return new StudentResponse(student);
    }

    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable long id){
      return studentService.deleteStudent(id);
    }

    @GetMapping("getByFirstName/{firstName}")
    public List<StudentResponse> getByFirstName(@PathVariable String firstName){
      List<Student> studentList = studentService.getByFirstName(firstName);

        List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();

        studentList.stream().forEach(student -> {
            studentResponseList.add(new StudentResponse(student));
        });
        return studentResponseList;
    }
}
