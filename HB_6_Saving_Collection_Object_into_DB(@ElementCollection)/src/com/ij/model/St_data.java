/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:5:55:57 am
 *DATE:13-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="Student_Data")
public class St_data {
	@Column(name="ST_NO") @Id @GeneratedValue(strategy=GenerationType.AUTO)
	
	private int no;
	@Column(name="ST_NAME")
	private String name;
	@Column(name="ST_PER_ADRESSES")
	@ElementCollection
	private List <Adress> adr=new ArrayList();
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "St_data [no=" + no + ", name=" + name + ", adr=" + adr + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Adress> getAdr() {
		return adr;
	}
	public void setAdr(List<Adress> adr) {
		this.adr = adr;
	}

}
