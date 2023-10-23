package com.spring_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_data_jpa.entities.Student;

public interface StudentDAO extends JpaRepository<Student, Integer>{

	
}
