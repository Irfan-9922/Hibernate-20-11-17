/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:1:31:03 pm
 *DATE:14-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="SCHOOL")
public class School {
	@Id @GeneratedValue
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String SchoolName;
	private String SchoolAdress;
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	public String getSchoolAdress() {
		return SchoolAdress;
	}
	public void setSchoolAdress(String schoolAdress) {
		SchoolAdress = schoolAdress;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "School [id=" + id + ", SchoolName=" + SchoolName + ", SchoolAdress=" + SchoolAdress + "]";
	}
	

}
