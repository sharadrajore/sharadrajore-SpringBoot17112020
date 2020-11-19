package com.zensar.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entites.Student;
import com.zensar.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;
	
		// @RequestMapping(value = "/students")
		public Iterable<Student> getAllStudents() {
			return repository.findAll();
		}

		// http://localhost:8080/{studentId}
		
		public Optional<Student> getStudent(int studentId) {
			return repository.findById(studentId);
		}

		
		public Student insertStudent(Student student) {
			return repository.save(student);
		}
		
		
	
		public void deleteStudent(int studentId) {
			 repository.deleteById(studentId);
		}
		
		// updating student object
		@PatchMapping("/students/{studentId}")
		public Student updateStudent(int studentId,Student updatedStudent) {
			return repository.save(updatedStudent);
		}

}
