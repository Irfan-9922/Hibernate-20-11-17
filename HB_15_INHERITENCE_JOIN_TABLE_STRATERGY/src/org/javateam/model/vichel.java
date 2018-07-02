/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:35:40 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class vichel {
	@Id @GeneratedValue
	private int Vichelid;
	public int getVichelid() {
		return Vichelid;
	}
	public void setVichelid(int vichelid) {
		Vichelid = vichelid;
	}
	public String getVichelName() {
		return VichelName;
	}
	public void setVichelName(String vichelName) {
		VichelName = vichelName;
	}
	private String VichelName;

}
