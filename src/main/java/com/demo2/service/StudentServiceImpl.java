package com.demo2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.dao.StudentRepository;
import com.demo2.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;
	
	@Override
	public Student saveStudent(Student student) {
	
		return repository.save(student);
	}

	@Override
	public Optional<Student> getStudent(Integer Id) {
		
		Optional<Student> student= repository.findById(Id);
		 return student;
	}

	@Override
	public Optional<Student> updateStudent(Integer Id) {
		
		return repository.findById(Id);
	}

	@Override
	public void deleteStudent(Integer id) {
		
	 repository.findById(id);
	}

}
