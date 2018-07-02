/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * NAME:shaikh irfan
 *
 * TIME:7:00:54 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
@DiscriminatorValue(value="FOUR_WHEELER")
public class fourwheeler extends vichel {
	private String SteringWheel;

	public String getSteringWheel() {
		return SteringWheel;
	}

	public void setSteringWheel(String steringWheel) {
		SteringWheel = steringWheel;
	}

}
