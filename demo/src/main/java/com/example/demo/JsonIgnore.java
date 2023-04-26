package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonIgnore{
	
	@GetMapping("/emp")
	public Empdetail getdet(@RequestBody Empdetail empdtl)
	{
		return empdtl;
	}
	
	@PostMapping("/empl")
	public Empdetail postdet(@RequestBody Empdetail empdtl)
	{
		return empdtl;
	}

}
