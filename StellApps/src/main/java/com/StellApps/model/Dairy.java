package com.StellApps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

@Entity
public class Dairy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String dairyName;
private String contactNum;
private String emilId;

public Dairy( String dairyName, String contactNum, String emilId) {
	super();
	this.dairyName = dairyName;
	this.contactNum = contactNum;
	this.emilId = emilId;
}
public Dairy() {
	super();
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDairyName() {
	return dairyName;
}
public void setDairyName(String dairyName) {
	this.dairyName = dairyName;
}
public String getContactNum() {
	return contactNum;
}
public void setContactNum(String contactNum) {
	this.contactNum = contactNum;
}
public String getEmilId() {
	return emilId;
}
public void setEmilId(String emilId) {
	this.emilId = emilId;
}


}
