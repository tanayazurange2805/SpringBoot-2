package com.demo2.service;

import java.util.Optional;

import com.demo2.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student) ;

   public Optional<Student> getStudent(Integer Id) ;
		
   public Optional<Student> updateStudent(Integer ID) ;
   
   public String deleteStudent(int id) ;
}

