/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:12:35:27 pm
 *DATE:20-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="SUBJECT1")
public class Subject {
	@Id @GeneratedValue
private int id;
public int getId() {
		return id;
	}
	/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Subject [id=" + id + ", Subject_Name=" + Subject_Name + "]";
}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject_Name() {
		return Subject_Name;
	}
	public void setSubject_Name(String subject_Name) {
		Subject_Name = subject_Name;
	}
private String Subject_Name;
}
