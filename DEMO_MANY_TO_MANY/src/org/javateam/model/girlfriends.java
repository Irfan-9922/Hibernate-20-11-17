/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * NAME:shaikh irfan
 *
 * TIME:5:45:27 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
public class girlfriends {
	@Id @GeneratedValue
	private int id;
	private String name;
	@ManyToMany
	private List<boyfriend> listofboyfriends=new ArrayList();
	
	public List<boyfriend> getListofboyfriends() {
		return listofboyfriends;
	}
	public void setListofboyfriends(List<boyfriend> listofboyfriends) {
		this.listofboyfriends = listofboyfriends;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "girlfriends [id=" + id + ", name=" + name + ", listofboyfriends=" + listofboyfriends + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	

}
