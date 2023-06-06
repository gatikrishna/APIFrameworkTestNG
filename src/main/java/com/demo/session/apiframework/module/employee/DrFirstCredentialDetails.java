package com.demo.session.apiframework.module.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DrFirstCredentialDetails {
	@JsonProperty("drFirstCredential")
	private boolean drFirstCredential;
	@JsonProperty("username")
	private String username;
	@JsonProperty("password")
	private String password;
	@JsonProperty("signature")
	private String signature;

	// Getter Methods

	public boolean getDrFirstCredential() {
		return drFirstCredential;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getSignature() {
		return signature;
	}

	// Setter Methods

	public void setDrFirstCredential(boolean drFirstCredential) {
		this.drFirstCredential = drFirstCredential;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

}
