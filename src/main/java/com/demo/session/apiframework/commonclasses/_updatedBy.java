package com.demo.session.apiframework.commonclasses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class _updatedBy {

	@JsonProperty("_id")
	private String _id;
	@JsonProperty("_links")
	_links _linksObject;

	// Getter Methods

	public String get_id() {
		return _id;
	}

	public _links get_links() {
		return _linksObject;
	}

	// Setter Methods

	public void set_id(String _id) {
		this._id = _id;
	}

	public void set_links(_links _linksObject) {
		this._linksObject = _linksObject;
	}

}
