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
import javax.persistence.criteria.CriteriaBuilder.Case;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:54:21 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
@Entity
public class student {
	@Id @GeneratedValue
	private int id;
	private String name;
	@ManyToMany
	private List<coursr> course=new ArrayList();
	public List<coursr> getCourse() {
		return course;
	}
	public void setCourse(List<coursr> course) {
		this.course = course;
	}
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
	

}
