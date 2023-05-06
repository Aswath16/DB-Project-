package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition
(info =@Info(
title = "Food stall",
version = "1.1.2",
description = "Food Project",
contact = @Contact(
		name = "Aaarif",
		email = "Akbaraarif007@gmail.com"
		)
)
)
@SpringBootApplication
public class Swagger1Application {

	public static void main(String[] args) {
		SpringApplication.run(Swagger1Application.class, args);
	}

}
