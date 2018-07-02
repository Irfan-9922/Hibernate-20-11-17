/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.oj.test;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.ij.model.Adress;
import com.ij.model.St_data;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:07:51 am
 *DATE:13-Nov-2017
 *TAGS:
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adress a1=new Adress();
		a1.setCity("latur");
		a1.setCountery("india");
		a1.setState("MH");
		a1.setZipcode(413512);
		
		Adress a2=new Adress();
		a2.setCity("makka");
		a2.setCountery("soudi");
		a2.setState("mk");
		a2.setZipcode(9182);
		
		St_data data=new St_data();
		data.setName("irfan");
		data.getAdr().add(a1);
		data.getAdr().add(a2);
		System.out.println(data);
		Session session = new Configuration().configure().buildSessionFactory().openSession();

		try{
				session.beginTransaction();
		session.save(data);
		session.getTransaction().commit();
		System.out.println("data saved");
		}
		catch(Exception e){
		session.getTransaction().rollback();
		}

	}

}
