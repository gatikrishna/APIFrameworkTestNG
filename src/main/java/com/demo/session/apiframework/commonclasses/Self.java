package com.demo.session.apiframework.commonclasses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Self {
	@JsonProperty("href")
	 private String href;


	 // Getter Methods 

	  public String getHref() {
	    return href;
	  }

	 // Setter Methods 

	  public void setHref( String href ) {
	    this.href = href;
	  }

}
