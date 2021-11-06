package com.jenkinscicd.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {

	@GetMapping("/studentName")
	public String getStudentName() {

		return "Manash is here";

	}

}
