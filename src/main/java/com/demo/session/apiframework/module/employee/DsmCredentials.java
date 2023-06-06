package com.demo.session.apiframework.module.employee;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DsmCredentials {
	@JsonProperty("delegateAccountAccess")
	private boolean delegateAccountAccess;
	@JsonProperty("allowedUsers")
	ArrayList<Object> allowedUsers = new ArrayList<Object>();
	
	public ArrayList<Object> getAllowedUsers() {
		return allowedUsers;
	}

	public void setAllowedUsers(ArrayList<Object> allowedUsers) {
		this.allowedUsers = allowedUsers;
	}

	// Getter Methods

	public boolean getDelegateAccountAccess() {
		return delegateAccountAccess;
	}

	// Setter Methods

	public void setDelegateAccountAccess(boolean delegateAccountAccess) {
		this.delegateAccountAccess = delegateAccountAccess;
	}
}
