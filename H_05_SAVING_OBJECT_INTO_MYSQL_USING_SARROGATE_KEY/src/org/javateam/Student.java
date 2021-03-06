/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * NAME:shaikh irfan
 *
 * TIME:8:57:42 pm
 *DATE:05-Dec-2017
 *TAGS:
 */
@Entity
public class Student {
	/*
	 * FOR GETNRATING SARROGATE KEY WE  HAVE REQUIRMENT LIKE 
	 * THE GENRATED VALUE IS NOT CONTINING BUSINESS RULES
	 * THIS IS CALLED AS SARROGATE KEY FOR THAT WE HAVE TO USE 
	 * @GENRATEDVALUE ANNOTATION
	 */
	@Id @GeneratedValue
private int studentId;
private String studentName;
private String studentAdress;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAdress() {
	return studentAdress;
}
public void setStudentAdress(String studentAdress) {
	this.studentAdress = studentAdress;
}

public Student(int studentId, String studentName, String studentAdress) {
	
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAdress = studentAdress;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdress=" + studentAdress
			+ "]";
}


}

