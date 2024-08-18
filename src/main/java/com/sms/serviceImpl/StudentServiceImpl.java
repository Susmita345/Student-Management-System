package com.sms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entities.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{

	@Autowired
	StudentRepository studentRepository;
	@Override
	public Student createStudent(Student student) 
	{
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}
