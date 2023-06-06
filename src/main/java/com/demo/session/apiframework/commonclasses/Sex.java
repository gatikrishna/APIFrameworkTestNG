package com.demo.session.apiframework.commonclasses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sex {
	@JsonProperty("name")
	private String name;
	@JsonProperty("key")
	private float key;
	@JsonProperty("order")
	private float order;
	@JsonProperty("notes")
	private String notes;

	// Getter Methods

	public String getName() {
		return name;
	}

	public float getKey() {
		return key;
	}

	public float getOrder() {
		return order;
	}

	public String getNotes() {
		return notes;
	}

	// Setter Methods

	public void setName(String name) {
		this.name = name;
	}

	public void setKey(float key) {
		this.key = key;
	}

	public void setOrder(float order) {
		this.order = order;
	}

	public void setNotes( String notes ) {
	    this.notes = notes;
	  }

}
