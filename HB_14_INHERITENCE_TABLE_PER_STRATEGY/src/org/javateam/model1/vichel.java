/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:10:07:58 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="Table_my")
public class vichel {
	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String Vichelname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVichelname() {
		return Vichelname;
	}
	public void setVichelname(String vichelname) {
		Vichelname = vichelname;
	}
	

}
