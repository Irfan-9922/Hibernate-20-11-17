/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:47:00 am
 *DATE:13-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="Att_Overrride")
public class Att_Ovrride {
	@Id @GeneratedValue
	private int no;
	@Embedded
	private Adress Home_adress;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Att_Ovrride [no=" + no + ", Home_adress=" + Home_adress + ", School_adress=" + School_adress + "]";
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public Adress getHome_adress() {
		return Home_adress;
	}


	public void setHome_adress(Adress home_adress) {
		Home_adress = home_adress;
	}


	public Adress getSchool_adress() {
		return School_adress;
	}


	public void setSchool_adress(Adress school_adress) {
		School_adress = school_adress;
	}


	@AttributeOverrides({
	@AttributeOverride (name="city" , column=@Column(name="SCHOOL_CITY")),
	@AttributeOverride(name="zipcode", column=@Column(name="School_Zipcode"))}
			
		
	)	
		
	@Embedded
	private Adress School_adress;

}
