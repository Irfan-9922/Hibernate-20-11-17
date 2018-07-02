/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model.demo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:5:05:09 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				Session session = new Configuration().configure().buildSessionFactory().openSession();
		          session.beginTransaction();
		          student s1=new student();
		          coursr c1=new coursr();
		              s1.setName("irfan");
		              student s2=new student();
		              s2.setName("ram");
		              student s3=new student();
		              s3.setName("nisar");
		              
		             
		                  c1.setCourceName("java");
		                  c1.getStudnet().add(s1);
		                  c1.getStudnet().add(s2);
		                  c1.getStudnet().add(s3);
		                  
		                  s1.getCourse().add(c1);
		                  s2.getCourse().add(c1);
		                  s3.getCourse().add(c1);
		                  session.save(s1);
		                  session.save(s2);
		                  session.save(s3);
		                  session.save(c1);
		                  
		                 
		                  
		           
		
	}

}
