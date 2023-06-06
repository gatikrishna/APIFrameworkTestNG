package com.demo.session.apiframework.commonclasses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class _links {
	@JsonProperty("self")
	Self SelfObject;

	// Getter Methods

	public Self getSelf() {
		return SelfObject;
	}

	// Setter Methods

	public void setSelf(Self selfObject) {
		this.SelfObject = selfObject;
	}

}
