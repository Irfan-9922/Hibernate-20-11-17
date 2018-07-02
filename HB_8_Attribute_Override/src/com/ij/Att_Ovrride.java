/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:47:00 am
 *DATE:13-Nov-2017
 *TAGS:
 */
@Entity
@Table(name="Att_ADRESS")
public class Att_Ovrride {
	@Column(name="ID")
	@Id @GeneratedValue
	private int id;
	@Column(name="NAME")
	private String name;
    @AttributeOverrides({
    	                 @AttributeOverride( name="city", column=@Column(name="OFFICE_ADDRESS")),
    	                 @AttributeOverride(name="zipcode" , column=@Column(name="OFFICE_ZIPCODE"))
    })
	private Adress OfficeAdress;
    @ElementCollection
    private List <Adress> HomeAdress =new ArrayList();
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
	public Adress getOfficeAdress() {
		return OfficeAdress;
	}
	public void setOfficeAdress(Adress officeAdress) {
		OfficeAdress = officeAdress;
	}
	public List<Adress> getHomeAdress() {
		return HomeAdress;
	}
	public void setHomeAdress(List<Adress> homeAdress) {
		HomeAdress = homeAdress;
	}
   
	
	
}
