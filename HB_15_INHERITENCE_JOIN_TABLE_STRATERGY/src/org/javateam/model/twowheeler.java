/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import javax.persistence.Entity;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:37:46 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
public class twowheeler extends vichel {
	private String twoWheelerHandel;

	public String getTwoWheelerHandel() {
		return twoWheelerHandel;
	}

	public void setTwoWheelerHandel(String twoWheelerHandel) {
		this.twoWheelerHandel = twoWheelerHandel;
	}

}
