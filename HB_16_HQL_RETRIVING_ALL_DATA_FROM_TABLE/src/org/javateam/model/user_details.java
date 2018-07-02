/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * NAME:shaikh irfan
 *
 * TIME:3:08:52 am
 *DATE:22-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="user_details")
@javax.persistence.NamedQuery(name = "get_by_id", query = "from user_details where user_id >=?")
@NamedNativeQuery(name="getbyname", query="select username from user_details where user_id>=999")
public class user_details {
	@Id @GeneratedValue
	private int user_id;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "user_details [user_id=" + user_id + ", username=" + username + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", gender=" + gender + ", password=" + password + ", status=" + status
				+ "]";
	}
	private String username;
	private String first_name;
	private String last_name;
	private String gender;
	private String password;
	private int status;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	

}
