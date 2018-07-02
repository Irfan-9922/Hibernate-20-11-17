/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
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
	
	@Id @GeneratedValue
private int studentId;
private String studentName;
/*
 * Aderss is asociated with student so direct student is
 * having its own minig but not a Adress;
 * so we have to embed adress object to student by using anotation
 * @Embedable(for class level) or @Embeded(on object level)
 */
@Embedded
private Adress studentAdress;
public void setStudentAdress(Adress studentAdress) {
	this.studentAdress = studentAdress;
}
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




public Student( String studentName, Adress studentAdress) {
	super();
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

