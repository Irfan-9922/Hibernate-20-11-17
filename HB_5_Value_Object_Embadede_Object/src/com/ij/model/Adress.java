/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

/**
 * NAME:shaikh irfan
 *
 * TIME:12:27:42 pm
 *DATE:10-Nov-2017
 *TAGS:
 */
public class Adress {
	private String city;
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
