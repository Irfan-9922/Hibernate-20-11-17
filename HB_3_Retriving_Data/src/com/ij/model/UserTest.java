/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import java.util.Date;

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
		u.setId(3);
		u.setAdress("latur");
		u.setDiscription("godd employee");
		u.setJoinDate(new Date());
		u.setSal(1233211.00f);
		u.setName("irfan");
		user u1=new user();
		u1.setId(4);
		u1.setAdress("pine");
		u1.setDiscription("badd employee");
		u1.setJoinDate(new Date());
		u1.setSal(121.00f);
		u1.setName("smaba");
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		Session ses=buildSessionFactory.openSession();
		//1
		//create the sessoinfactory object thest gives session
		//Configuration() this is identifyes the configretion file and read 
		//then configure by using configure() 
		try{
			
		
	 
	
		ses.beginTransaction();
		ses.save(u);
		ses.persist(u1);
	
		ses.getTransaction().commit();
		ses.close();

		ses=buildSessionFactory.openSession();
		user d =(user) ses.get(user.class, 3);
		user d1 =(user) ses.get(user.class, 4);
		System.out.println(d);
		System.out.println(d1);
		}
		catch(Exception e){
			ses.getTransaction().rollback();
		}
		
}
}