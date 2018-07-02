/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:04:45 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
public class CLass {
	private String C_name;
	private String C_faculty;
	
	
	public String getC_name() {
		return C_name;
	}


	public void setC_name(String c_name) {
		C_name = c_name;
	}


	public String getC_faculty() {
		return C_faculty;
	}


	public void setC_faculty(String c_faculty) {
		C_faculty = c_faculty;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CLass [C_name=" + C_name + ", C_faculty=" + C_faculty + "]";
	}

}
