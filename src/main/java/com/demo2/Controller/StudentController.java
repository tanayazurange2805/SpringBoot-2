package com.demo2.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.model.Student;
import com.demo2.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student student1=service.saveStudent(student);
		return  ResponseEntity.ok().body(student);
	}
	@GetMapping("/getStudent/{id}")
  public ResponseEntity<Optional<Student>> getStudent(@PathVariable("id") Integer id) {
	  Optional<Student> student=service.getStudent(id);
	  return  ResponseEntity.ok().body(student);
	  
  }
	/*
	 * @DeleteMapping("/delete/{id}") public void deleteById(@PathVariable("id")
	 * Integer id) { service.deleteStudent(id);
	 * 
	 * }
	 */
//
//	@DeleteMapping("/delete/{id}")
//	public void deleteById(@PathVariable("id") Integer id) throws Exception {
//
//		service.deleteStudent(id);
//	
//	}
	
	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
	@PutMapping("/update{id}")
	public Optional<Student> updateStudentById(@PathVariable("id") Integer id) {
		Optional<Student> student=service.updateStudent(id);
		return student;
	
	}
}
