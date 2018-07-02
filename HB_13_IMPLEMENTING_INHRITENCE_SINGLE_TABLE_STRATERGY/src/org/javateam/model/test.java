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
    
       vichel v=new vichel();
       v.setVichelName("car");
       
       twowheeler t=new twowheeler();
       t.setVichelName("bike");
       t.setSteringhandler("handle");
       fourwheeler f=new fourwheeler();
       f.setVichelName("ferari");
       f.setSteringWheel("stering");
       
       session.save(v);
       session.save(t);
       session.save(f);
       session.getTransaction().commit();
        
                
                 
                
	}

}
