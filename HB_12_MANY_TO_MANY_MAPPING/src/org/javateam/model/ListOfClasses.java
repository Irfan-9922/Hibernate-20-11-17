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
 * TIME:4:04:14 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="LIST_OF_CLASSES")
public class ListOfClasses {
	@Id @GeneratedValue
	private int id;
	@ElementCollection
	@Embedded
	private List<CLass> cla=new ArrayList();
	@ManyToMany
	private List<ListOfStudent> list=new ArrayList();
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListOfClasses [id=" + id + ", cla=" + cla + ", list=" + list + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<CLass> getCla() {
		return cla;
	}
	public void setCla(List<CLass> cla) {
		this.cla = cla;
	}
	public List<ListOfStudent> getList() {
		return list;
	}
	public void setList(List<ListOfStudent> list) {
		this.list = list;
	}
	

}
