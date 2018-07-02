/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:54:42 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="VICHEL_TYPE",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue( value = "VICHEL_CLASS")
public class vichel {
	@Id @GeneratedValue
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVichelName() {
		return vichelName;
	}
	public void setVichelName(String vichelName) {
		this.vichelName = vichelName;
	}
	private String vichelName;
	

}
