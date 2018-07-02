/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import javax.persistence.Column;

/**
 * NAME:shaikh irfan
 *
 * TIME:3:24:24 am DATE:10-Jan-2018 TAGS:
 */

public class Adress {
	@Column(name="STUD_HOME_COUNTERY")
	private String studentCountery;
	@Column(name="STUD_HOME_CITY")
	private String studentCity;
	@Column(name="STUD_HOME_ZIPCODE")
	private int studentAreaZipcode;

	
	/**
	 * 
	 */
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adress [studentCountery=" + studentCountery + ", studentCity=" + studentCity + ", studentAreaZipcode="
				+ studentAreaZipcode + "]";
	}

	public Adress(String studentCountery, String studentCity, int studentAreaZipcode) {
		super();
		this.studentCountery = studentCountery;
		this.studentCity = studentCity;
		this.studentAreaZipcode = studentAreaZipcode;
	}

	public String getStudentCountery() {
		return studentCountery;
	}

	public void setStudentCountery(String studentCountery) {
		this.studentCountery = studentCountery;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public int getStudentAreaZipcode() {
		return studentAreaZipcode;
	}

	public void setStudentAreaZipcode(int studentAreaZipcode) {
		this.studentAreaZipcode = studentAreaZipcode;
	}

}
