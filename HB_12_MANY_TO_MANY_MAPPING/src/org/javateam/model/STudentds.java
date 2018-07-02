/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:07:19 pm
 *DATE:21-Nov-2017
 *TAGS:
 */
public class STudentds {
	private String S_name;
	private int phno;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "STudentds [S_name=" + S_name + ", phno=" + phno + "]";
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}

}
