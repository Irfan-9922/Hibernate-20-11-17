/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:1:39:03 pm
 *DATE:20-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="STATE")
public class States {
	@Id @GeneratedValue
	private int id;
	@ElementCollection
	private List<StatsList> stList=new ArrayList();
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "States [id=" + id + ", stList=" + stList + ", countery=" + countery + "]";
	}
	@ManyToOne
	private Countery countery;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<StatsList> getStList() {
		return stList;
	}
	public void setStList(List<StatsList> stList) {
		this.stList = stList;
	}
	public Countery getCountery() {
		return countery;
	}
	public void setCountery(Countery countery) {
		this.countery = countery;
	}

}
