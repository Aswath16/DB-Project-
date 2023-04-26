package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1 {
	@RequestMapping("/Hi")
	public String Hello()
	{
	return "Welcome";
	}

}