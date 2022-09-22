package com.demo2.service;

import java.util.List;
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
	public Student updateStudent(Student student) {
		Student getStudent=repository.findById(student.getId()).orElse( null);
		getStudent.setName(student.getName());
		getStudent.setBranch(student.getBranch());
		getStudent.setGrade(student.getGrade());
		getStudent.setMarks(student.getMarks());
		
		return repository.save(getStudent);
	}

	@Override
	public String deleteStudent(int id) {
		
	 repository.deleteById(id);
	 return "student delete !!"+id;
	}

	@Override
	public List<Student> saveStudents(List<Student> students) {
	
		return repository.saveAll(students);
	}
	   public List<Student> getAllStudent(List<Student> student){
		   
		   return repository.findAll();
	   }

}
