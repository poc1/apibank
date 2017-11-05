package com.redhat.developers.pojo;

public class CredencialLogin {

	private String password;
	private String user;
	
	
	public CredencialLogin() {
		super();
		this.password = "";
		this.user = "";
	}
	
	public CredencialLogin(String password, String user) {
		super();
		this.password = password;
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	

}

