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
		ses.getTransaction().begin();
		
	

user s=(user) ses.get(user.class, 1);
ses.getTransaction().commit();
		System.out.println("first session");
		ses.close();
		
		Session ses1=buildSessionFactory.openSession();
		ses1.getTransaction().begin();
		user s1=(user) ses1.get(user.class, 1);
		System.out.println(s1);
		ses1.getTransaction().commit();
		ses.close();
		
	
}
}