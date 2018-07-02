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
 * TIME:1:34:57 pm
 *DATE:20-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="COUNTERY")
public class Countery {
	@Id @GeneratedValue
	private int id;
	private String Countery_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountery_name() {
		return Countery_name;
	}
	public void setCountery_name(String countery_name) {
		Countery_name = countery_name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Countery [id=" + id + ", Countery_name=" + Countery_name + "]";
	}
	

}
