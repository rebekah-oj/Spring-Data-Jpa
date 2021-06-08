package com.spring.Spring.Jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan({"com.spring.Spring.Jpa.controller", "com.spring.Spring.Jpa.service"})
@EntityScan("com.spring.Spring.Jpa.entity")
@EnableJpaRepositories("com.spring.Spring.Jpa.repository")
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

}
