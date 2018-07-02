/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * NAME:shaikh irfan
 *
 * TIME:7:12:19 pm DATE:05-Dec-2017 TAGS:
 */
@Entity
public class Student {
	@Id
	private int StudentId;
	private String Studentname;
	private String Adress;

	public Student(int studentId, String studentname, String adress) {
		super();
		StudentId = studentId;
		Studentname = studentname;
		Adress = adress;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", Studentname=" + Studentname + ", Adress=" + Adress + "]";
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

}
