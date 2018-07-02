/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import javax.persistence.Embeddable;

/**
 * NAME:shaikh irfan
 *
 * TIME:1:40:55 pm
 *DATE:20-Nov-2017
 *TAGS:
 */
@Embeddable
public class StatsList {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StatsList [name=" + name + "]";
	}
	

}
