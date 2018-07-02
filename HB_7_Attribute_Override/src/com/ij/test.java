/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:7:05:13 am
 *DATE:13-Nov-2017
 *TAGS:
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Att_Ovrride a=new Att_Ovrride();
SessionFactory sesfactory=new Configuration().configure().buildSessionFactory();
Session ses=sesfactory.openSession();

		
		 Adress home=new Adress();
		   
		       home.setCity("latur");
		       home.setZipcode(413512);
		  
		Adress school=new Adress();
		
		      school.setCity("hyd");
		      school.setZipcode(006666);
		      
		
   a.setHome_adress(home);
   a.setSchool_adress(school);
   try{
	   ses.getTransaction().begin();
	   ses.save(a);
	   ses.getTransaction().commit();
	   System.out.println("data saves"+a);
   }
   catch(Exception e){
	   ses.getTransaction().rollback();
   }

	}

}
