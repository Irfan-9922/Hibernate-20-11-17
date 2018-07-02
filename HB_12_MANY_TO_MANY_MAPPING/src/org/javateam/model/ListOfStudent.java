/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:03:49 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="LIST_OF_STUDENT")
public class ListOfStudent {
	@Id @GeneratedValue
	private int id;
	@ElementCollection
	@Embedded
	private List<STudentds> st=new ArrayList();
	@ManyToMany
	private List<ListOfClasses> lstcls=new ArrayList();
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListOfStudent [id=" + id + ", st=" + st + ", lstcls=" + lstcls + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<STudentds> getSt() {
		return st;
	}
	public void setSt(List<STudentds> st) {
		this.st = st;
	}
	public List<ListOfClasses> getLstcls() {
		return lstcls;
	}
	public void setLstcls(List<ListOfClasses> lstcls) {
		this.lstcls = lstcls;
	}
	

}
