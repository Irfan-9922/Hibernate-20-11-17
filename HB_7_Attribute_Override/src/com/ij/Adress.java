/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import javax.persistence.Column;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:49:50 am
 *DATE:13-Nov-2017
 *TAGS:
 */
public class Adress {
	@Column(name="HOME_City")
	private String city;
	@Column(name="HOME_Zipcode")
	private int zipcode;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adress [city=" + city + ", zipcode=" + zipcode + "]";
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