/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

/**
 * NAME:shaikh irfan
 *
 * TIME:3:24:24 am DATE:10-Jan-2018 TAGS:
 */

public class Adress {
	private String studentCountery;
	private String studentCity;
	private int studentAreaZipcode;

	
	/**
	 * 
	 */
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}

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
