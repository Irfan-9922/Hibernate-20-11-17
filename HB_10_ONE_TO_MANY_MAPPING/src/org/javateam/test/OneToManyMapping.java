/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.test;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.javateam.model.Student;
import org.javateam.model.Subject;

/**
 * NAME:shaikh irfan
 *
 * TIME:12:34:19 pm
 *DATE:20-Nov-2017
 *TAGS:
 */
public class OneToManyMapping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s1=new Subject();
		            s1.setSubject_Name("history");
		          
		Subject s2=new Subject();
		             s2.setSubject_Name("phisics");
		Subject s3=new Subject();
		              s3.setSubject_Name("chemistry");
		Student s=new Student();
		
		s.setName("irfan");
		s.setClass1("hSC");
		s.getGetsubject().add(s1);
		s.getGetsubject().add(s2);
		s.getGetsubject().add(s3);
		
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
        
		 session.beginTransaction();
		 session.save(s1);
		 session.save(s2);
		 session.save(s3);
		 session.save(s);
		
		 
		session.getTransaction().commit();
		
		Student ss=(Student)session.get(Student.class, 4);
		System.out.println(ss);
		 
		 
		
		
	}

}
