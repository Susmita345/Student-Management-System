package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entities.Student;
import com.sms.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	@PostMapping("/api/createStudent")
	Student createStudent(@RequestBody Student student )
	{
		return studentService.createStudent(student);
	}
	
}
