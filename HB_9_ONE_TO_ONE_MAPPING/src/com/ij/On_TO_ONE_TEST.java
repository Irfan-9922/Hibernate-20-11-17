/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:1:38:26 pm
 *DATE:14-Nov-2017
 *TAGS:
 */
public class On_TO_ONE_TEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure().buildSessionFactory().openSession();
         School s=new School();
         s.setSchoolAdress("latur");
         s.setSchoolName("shivaji vidhyalay");
         
         School s2=new School();
         s2.setSchoolAdress("hyd");
         s2.setSchoolName("JNTU");
         
         Student st=new Student();
         st.setStudentClass("inter");
         st.setStudentname("pathan");
         
         st.setSchool(s);
         st.setSchool(s2);
         
         session.beginTransaction();
         session.save(st);
         
         session.save(s);
        session.save(s2);
         session.getTransaction().commit();
         System.out.println("data saved"+st);
	}

}
