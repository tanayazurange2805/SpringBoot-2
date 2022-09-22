package com.demo2.Controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService service;

	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student student1 = service.saveStudent(student);
		return ResponseEntity.ok().body(student);
	}

	@GetMapping("/getStudent/{id}")
	public ResponseEntity<Optional<Student>> getStudent(@PathVariable("id") Integer id) {
		String methodName = "getStudent()";
		logger.info(methodName + " called");

		Optional<Student> student = service.getStudent(id);
		return ResponseEntity.ok().body(student);

	}

	@PostMapping("/saveAll")
	public List<Student> saveStudent(List<Student> student) {

		return service.saveStudents(student);
	}

	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}

	@PutMapping("/update")
	public Student updateStudentById(@RequestBody Student student) {
		return service.updateStudent(student);
	}

	@GetMapping("/students")
	public List<Student> getAllStudent(List<Student> student) {

		return service.getAllStudent(student);
	}
}
