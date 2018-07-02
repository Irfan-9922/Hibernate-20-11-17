/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.test;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.javateam.model.Countery;

import org.javateam.model.States;
import org.javateam.model.StatsList;

/**
 * NAME:shaikh irfan
 *
 * TIME:1:46:54 pm
 *DATE:20-Nov-2017
 *TAGS:
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countery countery=new Countery();
		countery.setCountery_name("INDIA");
		States state=new States();
		   StatsList s1=new StatsList();
		         s1.setName("maharastra");   
		   
		         StatsList s2=new StatsList();
		         s2.setName("punjab");   
		         StatsList s3=new StatsList();
		         s3.setName("Haryana");  
		         StatsList s4=new StatsList();
		         s4.setName("assam");   
		         StatsList s5=new StatsList();
		         s5.setName("Jammu&kashmir");
		        
		   state.setCountery(countery);
		   state.getStList().add(s1);
		   state.getStList().add(s2);
		   state.getStList().add(s3);
		   state.getStList().add(s4);
		   state.getStList().add(s5);
		   
		
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(countery);
		session.save(state);
		session.getTransaction().commit();
		States st=(States) session.get(States.class, 2);
		System.out.println(st);
		
		
		

	}

}
