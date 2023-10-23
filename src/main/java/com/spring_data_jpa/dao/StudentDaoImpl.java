package com.spring_data_jpa.dao;

import org.springframework.stereotype.Repository;

import com.spring_data_jpa.entities.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImpl implements StudentDAO{

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void saveStudent(Student student) {
		System.out.println("Record Inserted ....");
		entityManager.persist(student);
		
	}

}
