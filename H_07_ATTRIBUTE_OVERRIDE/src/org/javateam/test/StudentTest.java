/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javateam.Adress;
import org.javateam.Student;

/**
 * NAME:shaikh irfan
 *
 * TIME:2:01:44 am
 *DATE:10-Jan-2018
 *TAGS:
 */
public class StudentTest {

	
	public static void main(String[] args) {
       
		Adress HomeAdress=new Adress("india", "bhise wagholi", 8989);
		Adress SchoolAdress=new Adress("india", "pune", 8989);
		Student s1=new Student("hajjo",HomeAdress ,SchoolAdress);
		
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		try{
			session.beginTransaction();
			session.save(s1);
			session.getTransaction().commit();
			Student st=(Student) session.get(Student.class, 1);
			System.out.println(st);
		}catch(HibernateException e){
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}
		
		
		
	}

}
