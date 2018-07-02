/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * NAME:shaikh irfan
 *
 * TIME:12:21:49 pm
 *DATE:09-Nov-2017
 *TAGS:
 */
@Entity(name="maytable")
@Table(name="maytable1")
public class user {
	@Id
	private int id;
	@Transient
	private String adress;
	@Temporal(TemporalType.TIME)
	private java.util.Date joinDate;
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public java.util.Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(java.util.Date date) {
		this.joinDate = date;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Float getSal() {
		return sal;
	}
	public void setSal(Float sal) {
		this.sal = sal;
	}
	private String discription;
	private Float sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "user [id=" + id + ", adress=" + adress + ", joinDate=" + joinDate + ", discription=" + discription
				+ ", sal=" + sal + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	@Basic
	private String name;
	
	

}
