package com.redhat.developers.pojo;

public class CredencialAcessToken {

	private String scope;
	private String grant_type;
	private String token; // token credencial
	private String client_id;
	private String client_secret;
	
	
	public CredencialAcessToken() {
		super();
	}
	public CredencialAcessToken(String scope, String grant_type, String token, String client_id, String client_secret) {
		super();
		this.scope = scope;
		this.grant_type = grant_type;
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
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getGrant_type() {
		return grant_type;
	}
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}

	
	

}
