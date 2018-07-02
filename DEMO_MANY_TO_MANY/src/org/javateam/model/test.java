/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:5:48:43 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure().buildSessionFactory().openSession();
        session.beginTransaction();
    
        boyfriend b1=new boyfriend();
        boyfriend b2=new boyfriend();
        girlfriends g1=new girlfriends();
        girlfriends g2=new girlfriends();
        girlfriends g3=new girlfriends();
                  b1.setName("irfan");
                  b2.setName("ram");
                  g1.setName("rani");
                  g2.setName("pooja");
                  g3.setName("jooom");
                  
                 
                  b1.getListofgirlfriends().add(g1);
                  b1.getListofgirlfriends().add(g2);
                  b2.getListofgirlfriends().add(g3);
                  
                  g3.getListofboyfriends().add(b1);
                  g3.getListofboyfriends().add(b2);
                  g2.getListofboyfriends().add(b1);
                  g2.getListofboyfriends().add(b2);
                  
                  
                 
                  
                  
                  session.save(b1);
                  session.save(b2);
                  session.save(g1);
                  session.save(g2);
                  session.save(g3);
                  System.out.println("data saved");
                  session.getTransaction().commit();
                 
                
        
                
                 
                
	}

}
