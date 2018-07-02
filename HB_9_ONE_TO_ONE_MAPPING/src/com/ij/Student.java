/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:1:34:53 pm
 *DATE:14-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="STUDENT")
public class Student {
	@Id @GeneratedValue
	int id;
	private String Studentname;
	private String StudentClass;
	@OneToOne
	private School school;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", Studentname=" + Studentname + ", StudentClass=" + StudentClass + ", school="
				+ school + "]";
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getStudentClass() {
		return StudentClass;
	}
	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}


}
