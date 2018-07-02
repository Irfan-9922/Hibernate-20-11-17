/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:41:00 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Session se=new Configuration().configure().buildSessionFactory().openSession();
      se.getTransaction().begin();
      
      vichel v=new vichel();
      v.setVichelName("BMW");
      
      
      twowheeler t=new twowheeler();
      t.setTwoWheelerHandel("Handle");
      t.setVichelName("HERLY DEVIDSON");
      FourWheeler f=new FourWheeler();
      f.setVichelName("FERARI");
      f.setFourWheelerHandle("Stering wheel");
      se.save(v);
      se.save(t);
      se.save(f);
      se.getTransaction().commit();
      se.close();
	}

}
