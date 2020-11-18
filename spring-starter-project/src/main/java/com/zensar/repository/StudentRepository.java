package com.zensar.repository;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entites.Student;

public interface StudentRepository {
	
	public List<Student> getAllStudents();
	public Student getStudent(int studentId);
	public boolean insertStudent(Student student);
	public boolean deleteStudent(int studentId);
	public Student updateStudent(int studentId,@RequestBody Student updatedStudent);

}
