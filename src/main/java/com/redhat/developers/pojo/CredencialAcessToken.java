package com.redhat.developers.pojo;

public class CredencialAcessToken {

	private String token; // token credencial
	private String client_id;
	private String client_secret;
	
	
	public CredencialAcessToken() {
		super();
	}
	public CredencialAcessToken(String token, String client_id, String client_secret) {
		super();
		this.token = token;
		this.client_id = client_id;
		this.client_secret = client_secret;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_secret() {
		return client_secret;
	}
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}
	
	
	

}
