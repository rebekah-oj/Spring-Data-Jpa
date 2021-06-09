package com.spring.Spring.Jpa.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class UpdateStudentRequest {

    @NotNull(message = "student ID is required")
    private Long id;

    private String firstName;

    private String lastName;

    private String email;
}
