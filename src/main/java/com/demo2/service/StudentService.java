package com.demo2.service;

import java.util.List;
import java.util.Optional;

import com.demo2.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student) ;

   public Optional<Student> getStudent(Integer Id) ;
		
   public Student updateStudent(Student student) ;
   
   public String deleteStudent(int id) ;
   
   public List<Student> saveStudents(List<Student> students);
   
   public List<Student> getAllStudent(List<Student> student);
   
}

