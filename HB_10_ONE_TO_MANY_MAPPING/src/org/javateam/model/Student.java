/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:12:35:13 pm
 *DATE:20-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="STUDENT1")
public class Student {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Class1=" + Class1 + ", getsubject=" + getsubject + "]";
	}
	@Id @GeneratedValue
	private int id;
	private String name;
	private String Class1;
	@OneToMany
	private List<Subject> getsubject=new ArrayList();
	public List<Subject> getGetsubject() {
		return getsubject;
	}
	public void setGetsubject(List<Subject> getsubject) {
		this.getsubject = getsubject;
	}
	public void setClass1(String class1) {
		Class1 = class1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClass1() {
		return Class1;
	}
	public void setClass(String class1) {
		Class1 = class1;
	}

}
