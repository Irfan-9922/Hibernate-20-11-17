/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:54:01 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
public class coursr {
	@Id @GeneratedValue
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourceName() {
		return courceName;
	}
	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}
	public List<student> getStudnet() {
		return studnet;
	}
	public void setStudnet(List<student> studnet) {
		this.studnet = studnet;
	}
	private String courceName;
	@ManyToMany
	private List<student> studnet=new ArrayList();

}
