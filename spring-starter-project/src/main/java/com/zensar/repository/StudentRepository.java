package com.zensar.repository;

import org.springframework.data.repository.CrudRepository;

import com.zensar.entites.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
