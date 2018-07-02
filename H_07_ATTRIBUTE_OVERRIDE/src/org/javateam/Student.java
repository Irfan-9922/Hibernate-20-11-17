/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
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
private Adress studentHomeAdress;
@Embedded
@AttributeOverrides(value = {
		
		@AttributeOverride(name="studentCountery",column = @Column (name = "STUD_SCH_COUNTERY")),
		@AttributeOverride(name="studentCity",column = @Column( name = "STUD_SCH_CITY")),
		@AttributeOverride(name="studentAreaZipcode",column=@Column(name="STUD_SCH_ZIP"))
             })
private Adress studentScchoolAdress;



/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentHomeAdress="
			+ studentHomeAdress + ", studentScchoolAdress=" + studentScchoolAdress + "]";
}
public Student( String studentName, Adress studentHomeAdress, Adress studentScchoolAdress) {
	super();
	this.studentName = studentName;
	this.studentHomeAdress = studentHomeAdress;
	this.studentScchoolAdress = studentScchoolAdress;
}
/**
 * 
 */
public Student() {
	super();
	// TODO Auto-generated constructor stub
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
public Adress getStudentHomeAdress() {
	return studentHomeAdress;
}
public void setStudentHomeAdress(Adress studentHomeAdress) {
	this.studentHomeAdress = studentHomeAdress;
}
public Adress getStudentScchoolAdress() {
	return studentScchoolAdress;
}
public void setStudentScchoolAdress(Adress studentScchoolAdress) {
	this.studentScchoolAdress = studentScchoolAdress;
}

}
