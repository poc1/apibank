package com.redhat.developers.pojo;

public class TokenCredencial {
private String token;
	
	
	public TokenCredencial() {
		super();
		this.token = "";
	}

	public TokenCredencial(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
