/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:11:29 am DATE:23-Nov-2017 TAGS:
 */
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses = new Configuration().configure().buildSessionFactory().openSession();
		ses.getTransaction().begin();

		//get all the record form database insted of using table name use class name
		
		Query query = ses.createQuery("from user_details ");
		
		//query returns list of records and it gives its own list method
		//we have to store all record inside a list
		/* List<user_details> listofuser= query.list();
		 
		 for(user_details s:listofuser){
			 System.out.println(s);
		 }*/
		
		/*
		 * pagination type  
		 */
		/*query.setFirstResult(900);
		query.setMaxResults(10);
		List<user_details> listofuser=query.list();
		for(user_details g:listofuser){
			System.out.println(g.getUser_id());
		}*/
		
		/*
		 * aggrigation type function
		 */
		/*Query query1 = ses.createQuery("select max (user_id) from user_details ");
		List s=query1.list();
		System.out.println(s);*/
		
		
		/*
		 * map type
		 */
		/*Query query1 = ses.createQuery("select new map(user_id,username) from user_details ");
		query1.setFirstResult(1);
		query1.setMaxResults(3);
		List s=query1.list();
		System.out.println(s);*/
		
		/*
		 * positional parameter parameter
		 * this concept is usefull for avoiding sql injection 
		 */
		
		
		/*int no=12;
		Query query1 = ses.createQuery("select new map (username,password) from user_details where user_id= "+"?");
		
		query1.setInteger(0, no);
		
		List<Object> list=query1.list();
		for(Object s:list){
			System.out.println(list);
		}
		*/
		
		/*
		 *  named positional parameter
		 * this concept is usefull for avoiding sql injection 
		
		 */
		/*
Query query1 = ses.createQuery("select new map (username) from user_details where user_id=:user_id");
		
		query1.setInteger("user_id", no);
		
		List<Object> list=query1.list();
		for(Object s:list){
			System.out.println(list);
		}
		
		*/
		/**
		 * named sql query example
		 */
	/*	int no=999;
		Query query1 = ses.getNamedQuery("get_by_id");
		query1.setInteger(0, no);
		List<user_details> list=query1.list();
		for(user_details d:list){
			System.out.println(d);
		}

		*/
		     
		
		Query query1 = ses.getNamedQuery("getbyname");
		
		List<Object> list=query1.list();
		for(Object d:list){
			System.out.println(d);
		}
	}

}
