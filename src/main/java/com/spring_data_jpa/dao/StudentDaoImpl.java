package com.spring_data_jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring_data_jpa.entities.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

//@Repository
//public class StudentDaoImpl {
//
//	@PersistenceContext
//	@Autowired
//	EntityManager entityManager;
//	
//	@Transactional
//	public void saveStudent(Student student) {
//		System.out.println("Record Inserted ....");
//		entityManager.persist(student);
//		
//	}
//
//}
