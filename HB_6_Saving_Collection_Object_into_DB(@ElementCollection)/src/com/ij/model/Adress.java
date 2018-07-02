/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import javax.persistence.Embeddable;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:00:08 am
 *DATE:13-Nov-2017
 *TAGS:
 */
@Embeddable
public class Adress {
	private String countery;
	private String state;
	private String city;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adress [countery=" + countery + ", state=" + state + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	private int zipcode;
	public String getCountery() {
		return countery;
	}
	public void setCountery(String countery) {
		this.countery = countery;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
