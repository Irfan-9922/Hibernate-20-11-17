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

		
		 Adress Office=new Adress();
		 Office.setCity("pune");
		 Office.setZipcode(1232);
		 
		 Adress home_permanant=new Adress();
		 home_permanant.setCity("latur");
		 home_permanant.setZipcode(41312);
		 
		 Adress Home_Temorory=new Adress();
		 Home_Temorory.setCity("mumbai");

		 Home_Temorory.setZipcode(989);
		 Att_Ovrride a1=new Att_Ovrride();
		 a1.setName("irfan");
		 a1.setOfficeAdress(Office);
		 a1.getHomeAdress().add(Home_Temorory);
		 a1.getHomeAdress().add(home_permanant);
		   
		      
   try{
	   ses.getTransaction().begin();
	   ses.save(a1);
	   ses.getTransaction().commit();
	   System.out.println("data saves"+a1);
   }
   catch(Exception e){
	   ses.getTransaction().rollback();
   }

	}

}
