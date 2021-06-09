package com.spring.Spring.Jpa.entity;

import com.spring.Spring.Jpa.request.StudentRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    public Student (StudentRequest studentRequest){
        this.firstName = studentRequest.getFirstName();
        this.lastName = studentRequest.getLastName();
        this.email = studentRequest.getEmail();
    }
}
