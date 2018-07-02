/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * NAME:shaikh irfan
 *
 * TIME:5:45:13 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
public class boyfriend {
	@Id @GeneratedValue
	private int id;
	private String name;
	@ManyToMany
	private List<girlfriends> listofgirlfriends=new ArrayList();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<girlfriends> getListofgirlfriends() {
		return listofgirlfriends;
	}
	public void setListofgirlfriends(List<girlfriends> listofgirlfriends) {
		this.listofgirlfriends = listofgirlfriends;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "boyfriend [id=" + id + ", name=" + name + ", listofgirlfriends=" + listofgirlfriends + "]";
	}
	

}
