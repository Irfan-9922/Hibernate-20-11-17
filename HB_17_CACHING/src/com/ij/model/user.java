/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * NAME:shaikh irfan
 *
 * TIME:12:21:49 pm
 *DATE:09-Nov-2017
 *TAGS:
 */
@Entity(name="maytable")
@Table(name="maytable1")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class user {
	@Id
	private int id;
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
	private String name;
	
	

}
