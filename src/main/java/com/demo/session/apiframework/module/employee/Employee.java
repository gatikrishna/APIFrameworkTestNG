package com.demo.session.apiframework.module.employee;

import java.util.ArrayList;

import com.demo.session.apiframework.commonclasses.Address;
import com.demo.session.apiframework.commonclasses._links;
import com.demo.session.apiframework.commonclasses.Sex;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.demo.session.apiframework.commonclasses._createdBy;
import com.demo.session.apiframework.commonclasses._updatedBy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {

    @JsonProperty("designation")
    public String designation;
    @JsonProperty("firstName")
    public String firstName;
    @JsonProperty("lastName")
    public String lastName;
    @JsonProperty("nickName")
    public String nickName;
    @JsonProperty("employeeNumber")
    public String employeeNumber;
    @JsonProperty("dob")
    public String dob;
    public Sex sex;
    @JsonProperty("id")
    public String id;
    @JsonProperty("available")
    public boolean available;
    @JsonProperty("age")
    public String age;
    @JsonProperty("address")
    public Address address;
    @JsonProperty("inHouse")
    public boolean inHouse;
    public ProviderDetails providerDetails;
    public _links _links;
    public ArrayList<Office> offices;
    public ArrayList<PreferredOffice> preferredOffices;
    @JsonProperty("managerialAdjustments")
    public boolean managerialAdjustments;
    @JsonProperty("overrideExpiredPromo")
    public boolean overrideExpiredPromo;
    public DsmCredentials dsmCredentials;
    @JsonProperty("userName")
    public String userName;
    @JsonProperty("_id")
    public String _id;
    @JsonProperty("_version")
    public String _version;
    @JsonProperty("_created")
    public String _created;
    @JsonProperty("_updated")
    public String _updated;
    @JsonProperty("status")
    public String status;

    @JsonProperty("_createdBy")
    public _createdBy _createdBy;
    @JsonProperty("_updatedBy")
    public _updatedBy _updatedBy;
    @JsonProperty("sources")
    public ArrayList<Object> sources;


    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public ProviderDetails getProviderDetails() {
        return providerDetails;
    }

    public void setProviderDetails(ProviderDetails providerDetails) {
        this.providerDetails = providerDetails;
    }

    public _links get_links() {
        return _links;
    }

    public void set_links(_links _links) {
        this._links = _links;
    }

    public ArrayList<Office> getOffices() {
        return offices;
    }

    public void setOffices(ArrayList<Office> offices) {
        this.offices = offices;
    }

    public ArrayList<PreferredOffice> getPreferredOffices() {
        return preferredOffices;
    }

    public void setPreferredOffices(ArrayList<PreferredOffice> preferredOffices) {
        this.preferredOffices = preferredOffices;
    }

    public DsmCredentials getDsmCredentials() {
        return dsmCredentials;
    }

    public void setDsmCredentials(DsmCredentials dsmCredentials) {
        this.dsmCredentials = dsmCredentials;
    }

    public _createdBy get_createdBy() {
        return _createdBy;
    }

    public void set_createdBy(_createdBy _createdBy) {
        this._createdBy = _createdBy;
    }

    public _updatedBy get_updatedBy() {
        return _updatedBy;
    }

    public void set_updatedBy(_updatedBy _updatedBy) {
        this._updatedBy = _updatedBy;
    }

    public ArrayList<Object> getSources() {
        return sources;
    }

    public void setSources(ArrayList<Object> sources) {
        this.sources = sources;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isInHouse() {
        return inHouse;
    }

    public void setInHouse(boolean inHouse) {
        this.inHouse = inHouse;
    }

    public boolean isManagerialAdjustments() {
        return managerialAdjustments;
    }

    public void setManagerialAdjustments(boolean managerialAdjustments) {
        this.managerialAdjustments = managerialAdjustments;
    }

    public boolean isOverrideExpiredPromo() {
        return overrideExpiredPromo;
    }

    public void setOverrideExpiredPromo(boolean overrideExpiredPromo) {
        this.overrideExpiredPromo = overrideExpiredPromo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_version() {
        return _version;
    }

    public void set_version(String _version) {
        this._version = _version;
    }

    public String get_created() {
        return _created;
    }

    public void set_created(String _created) {
        this._created = _created;
    }

    public String get_updated() {
        return _updated;
    }

    public void set_updated(String _updated) {
        this._updated = _updated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
