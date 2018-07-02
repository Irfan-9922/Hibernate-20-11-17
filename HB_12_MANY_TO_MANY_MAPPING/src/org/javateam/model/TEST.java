/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:19:11 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
public class TEST {

	/**
	 * @param args
	 */
	  static  ListOfStudent lststd=new ListOfStudent();
      static  ListOfClasses lstcls=new ListOfClasses();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure().buildSessionFactory().openSession();
          session.beginTransaction();
      
          CLass c1=new CLass();
                 c1.setC_name("java");
                 c1.setC_faculty("natraz sir");
                
                 CLass c2=new CLass();
                 c2.setC_name(".net");
                 c2.setC_faculty("sing sir");
                 
          
                
          
          STudentds s1=new STudentds();
                     s1.setPhno(123);
                     s1.setS_name("irfan");
                     
                     STudentds s2=new STudentds();
                     s2.setPhno(9090);
                     s2.setS_name("ilahi");
                     lststd.getSt().add(s1);
                     lststd.getSt().add(s2);
                    
          lstcls.getCla().add(c1);
          lstcls.getCla().add(c2);
          lstcls.getList().add(lststd);
          lststd.getLstcls().add(lstcls);
          
          
          
          
          
          
          
                    session.save(lstcls);
                    session.save(lststd);
                 
                    
               System.out.println("data saved");
          
          
          
          
	}

}
