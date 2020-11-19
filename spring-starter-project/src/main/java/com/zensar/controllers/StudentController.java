package com.zensar.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entites.Student;
import com.zensar.services.StudentService;

@RestController
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {
		MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE
})
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	// CRUD -> Created,Read,updated,delete

	
	// http://localhost:8080/students
	@GetMapping(value = "/students")
	// @RequestMapping(value = "/students")
	public Iterable<Student> getAllStudents() {
		return service.getAllStudents();
	}

	// http://localhost:8080/{studentId}
	@GetMapping("/students/{studentId}")
	public Optional<Student> getStudent(@PathVariable("studentId") int studentId) {
		return service.getStudent(studentId);
	}

	@PostMapping(value = "/students")
	public Student insertStudent(@RequestBody Student student) {
		System.out.println(student);
		return service.insertStudent(student);
	}
	
	
	@DeleteMapping("/students/{studentId}")
	public void deleteStudent(@PathVariable int studentId) {
		
		 service.deleteStudent(studentId);
		
	}
	
	// updating student object
	@PatchMapping("/students/{studentId}")
	public Student updateStudent(@PathVariable("studentId")int studentId,@RequestBody Student updatedStudent) {
		return service.updateStudent(studentId,updatedStudent);
	}

}
