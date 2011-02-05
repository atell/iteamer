package com.iteamer.model;

/**
 * 团队成员
 * 
 * @author atell
 * 
 */
public class Mate {

	private String email;
	private String pwd;
	private String name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mate [email=" + email + ", name=" + name + ", pwd=" + pwd + "]";
	}

}
