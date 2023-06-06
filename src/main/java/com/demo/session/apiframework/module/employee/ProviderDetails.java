package com.demo.session.apiframework.module.employee;

import java.util.ArrayList;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProviderDetails {
	@JsonProperty("isProvider")
	private boolean isProvider;
	@JsonProperty("isExternalProvider")
	private boolean isExternalProvider;
	@JsonProperty("DrFirstCredentialDetailsObject")
	DrFirstCredentialDetails DrFirstCredentialDetailsObject;
	@JsonProperty("npi")
	private String npi;
	@JsonProperty("professionalEq")
	private String professionalEq;
	@JsonProperty("opticalEq")
	private String opticalEq;
	@JsonProperty("surgicalEq")
	private String surgicalEq;
	@JsonProperty("contactEq")
	private String contactEq;
	@JsonProperty("provider")
	private String provider;
	@JsonProperty("onlineProvider")
	private boolean onlineProvider;
	@JsonProperty("license")
//	@JsonE(JsonInclude.Include.NON_EMPTY)
	ArrayList<Object> license = new ArrayList<Object>();
	@JsonProperty("deaIds")
	ArrayList<Object> deaIds = new ArrayList<Object>();
	@JsonProperty("taxonomyCode")
	private String taxonomyCode;
	@JsonProperty("classification")
	private String classification;
	@JsonProperty("specialization")
	private String specialization;

	// Getter Methods

	public boolean getIsProvider() {
		return isProvider;
	}

	public boolean getIsExternalProvider() {
		return isExternalProvider;
	}

	public DrFirstCredentialDetails getDrFirstCredentialDetails() {
		return DrFirstCredentialDetailsObject;
	}

	public String getNpi() {
		return npi;
	}

	public String getProfessionalEq() {
		return professionalEq;
	}

	public String getOpticalEq() {
		return opticalEq;
	}

	public String getSurgicalEq() {
		return surgicalEq;
	}

	public String getContactEq() {
		return contactEq;
	}

	public String getProvider() {
		return provider;
	}

	public boolean getOnlineProvider() {
		return onlineProvider;
	}

	public String getTaxonomyCode() {
		return taxonomyCode;
	}

	public String getClassification() {
		return classification;
	}

	public String getSpecialization() {
		return specialization;
	}

	// Setter Methods

	public void setIsProvider(boolean isProvider) {
		this.isProvider = isProvider;
	}

	public void setIsExternalProvider(boolean isExternalProvider) {
		this.isExternalProvider = isExternalProvider;
	}

	public void setDrFirstCredentialDetails(DrFirstCredentialDetails drFirstCredentialDetailsObject) {
		this.DrFirstCredentialDetailsObject = drFirstCredentialDetailsObject;
	}

	public ArrayList<Object> getLicense() {
		return license;
	}

	public void setLicense(ArrayList<Object> license) {
		this.license = license;
	}

	public ArrayList<Object> getDeaIds() {
		return deaIds;
	}

	public void setDeaIds(ArrayList<Object> deaIds) {
		this.deaIds = deaIds;
	}

	public void setNpi(String npi) {
		this.npi = npi;
	}

	public void setProfessionalEq(String professionalEq) {
		this.professionalEq = professionalEq;
	}

	public void setOpticalEq(String opticalEq) {
		this.opticalEq = opticalEq;
	}

	public void setSurgicalEq(String surgicalEq) {
		this.surgicalEq = surgicalEq;
	}

	public void setContactEq(String contactEq) {
		this.contactEq = contactEq;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void setOnlineProvider(boolean onlineProvider) {
		this.onlineProvider = onlineProvider;
	}

	public void setTaxonomyCode(String taxonomyCode) {
		this.taxonomyCode = taxonomyCode;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
