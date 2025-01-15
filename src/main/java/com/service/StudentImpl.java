package com.service;

import java.sql.ResultSet;
import java.util.List;
import com.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class StudentImpl {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mysql");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public String loginStudent(String email,String pass) {

		Query query=entityManager.createQuery("select s from Student s");

		List<Student> res = query.getResultList();
		/*
		 * for (Student student : res) { System.out.println(student.getId()+
		 * student.getName()); }
		 */
		
		String studEmial=email;
		String studPass=pass;
		
		System.out.println(studEmial);
		System.out.println(studPass);
		
		
		for (Student student : res) {
			if(studEmial.equals(student.getEmail()) && studPass.equals(student.getPass())){
				System.out.println(student.getEmail());
				System.out.println(student.getPass());
				System.out.println("Login success");
				studEmial=studEmial;
			}else {
				System.out.println("Login failed");
				studEmial="null";
			}
		}
		return studEmial;
	}

	public String save(String name,String email,String pass) {

		Student student = Student.builder().name(name).email(email).pass(pass).build();
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		
		
		return student.getName();
	}

	public String updateData(int id, String name, String email, String pass) {
		String res=null;
		Student s=entityManager.find(Student.class, id);
		
		System.out.println("Id: "+s);
		if(s!=null)
		{
			Student student = Student.builder().name(name).email(email).pass(pass).build();
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
		res = student.getName();
		}
		
		return res;
	}

	public String deleteData(int id) {

		System.out.println("Inside deleteImpl Id is "+id);
		Student stud = entityManager.find(Student.class, id);
		System.out.println(stud);
		if(stud!=null)
		{
			System.out.println("Inside impl");
			entityTransaction.begin();
			entityManager.remove(stud);
			entityTransaction.commit();
			
			return "records deleted";
		}
		
		return "records not deleted";
	}
}
