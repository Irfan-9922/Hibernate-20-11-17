/**@COPYRIGHTS ALL RIwhanGHTS ARE RESERVED
 * 
 */
package org.javateam.model1;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import antlr.TokenWithIndex;

/**
 * NAME:shaikh irfan
 *
 * TIME:10:12:03 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vichel v=new vichel();
		v.setVichelname("BMW");
		
		twowheeler t=new twowheeler();
		t.setVichelname("HERLY_DEVIDSON");
		t.setHandle("handle");
		fourwheeler f=new fourwheeler();
		f.setVichelname("FERARI");
		f.setWheel_Handle("wheel_Handle");
		Session session=new Configuration().configure().buildSessionFactory().openSession();
          session.getTransaction().begin();
          session.save(v);
          session.save(t);
          session.save(f);
          session.getTransaction().commit();
          session.close();
          
	}

}
