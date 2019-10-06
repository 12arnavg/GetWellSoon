package com.externalservice;

public class LocationDTO {

	private String name;

	private String zip;

	public LocationDTO(String name, String zip) {
		super();
		this.name = name;
		this.zip = zip;
	}

	public LocationDTO() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}