package com.demo2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo2.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
