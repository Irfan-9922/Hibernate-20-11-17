/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:1:49:11 pm
 *DATE:09-Nov-2017
 *TAGS:
 */
public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user u=new user();
		u.setId(2);
		u.setName("java boss  here 1");
	
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		Session ses=buildSessionFactory.openSession();
		//1
		//create the sessoinfactory object thest gives session
		//Configuration() this is identifyes the configretion file and read 
		//then configure by using configure() 
		try{
			
		
	   Long time=System.currentTimeMillis();
	 //  Long time1=System.currentTimeMillis();
		ses.beginTransaction();
		ses.save(u);
		ses.getTransaction().commit();
		System.out.println("data is saved");
		 Long time1=System.currentTimeMillis();
		System.out.println(time1-time);
		
		}
		catch(Exception e){
			ses.getTransaction().rollback();
		}
		finally {
			System.out.println("close");
		}
}
}