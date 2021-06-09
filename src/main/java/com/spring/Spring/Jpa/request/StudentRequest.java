package com.spring.Spring.Jpa.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
public class StudentRequest {

    @JsonProperty("first_name")
    @NotBlank(message = "First name is required")
    private String firstName;

    private String lastName;

    private String email;
}
