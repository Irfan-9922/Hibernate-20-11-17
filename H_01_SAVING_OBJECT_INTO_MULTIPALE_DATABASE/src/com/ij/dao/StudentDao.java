/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ij.model.Student;

/**
 * NAME:shaikh irfan
 *
 * TIME:7:18:50 pm
 *DATE:05-Dec-2017
 *TAGS:
 */
public class StudentDao {

	
	public static void main(String[] args) {
    
		
		Student student=new Student(9922, "irfan", "latur");
		//Student student1=new Student(9323993, "nisar", "pune");
		//Student student2=new Student(9773333, "azar", "mumbai");
		SessionFactory sessionF2=new Configuration().configure("MySqlConfiguration.xml").buildSessionFactory();
		//SessionFactory sessionF=new Configuration().configure("Hibernate.xml").buildSessionFactory();
	//	Session session=sessionF.openSession();
		Session session2=sessionF2.openSession();
		try{
		//	session.beginTransaction();
			session2.beginTransaction();
			//session2.save(student1);
			session2.save(student);         
			
			
			//session.save(student1);
			//session.save(student2);
			//session.getTransaction().commit();
			session2.getTransaction().commit();
			System.out.println("data is saved sucessfully");
		}catch(HibernateException e){
			System.out.println("data is not saved ito database");
			//session.getTransaction().rollback();
		}
		
	}

}
