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
 * TIME:6:59:35 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
@DiscriminatorValue(value="TWO_WHEELER")
public class twowheeler extends vichel {
 
	
	private String steringhandler;

	public String getSteringhandler() {
		return steringhandler;
	}

	public void setSteringhandler(String steringhandler) {
		this.steringhandler = steringhandler;
	}
}
