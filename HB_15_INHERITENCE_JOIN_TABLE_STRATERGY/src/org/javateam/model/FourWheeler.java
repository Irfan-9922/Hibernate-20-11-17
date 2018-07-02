/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import javax.persistence.Entity;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:39:48 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
public class FourWheeler extends vichel{
	private String FourWheelerHandle;

	public String getFourWheelerHandle() {
		return FourWheelerHandle;
	}

	public void setFourWheelerHandle(String fourWheelerHandle) {
		FourWheelerHandle = fourWheelerHandle;
	}

	
}
