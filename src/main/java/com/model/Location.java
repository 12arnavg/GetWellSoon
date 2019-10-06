package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "locations")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int locationId;

	private String locationName;

	private String locationStreetAddress;

	private String locationCity;

	private String locationState;

	private String locationCountry;

	private String locationZip;

	private String locationContact;

	private long locationPhone;

	private int trialId;

	/*
	 * @JsonBackReference
	 * 
	 * @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	 * 
	 * @JoinColumn(name = "trialId") private Trial trial;
	 */
	public Location(int locationId, String locationName, String locationStreetAddress, String locationCity,
			String locationState, String locationCountry, String locationZip, String locationContact,
			long locationPhone) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.locationStreetAddress = locationStreetAddress;
		this.locationCity = locationCity;
		this.locationState = locationState;
		this.locationCountry = locationCountry;
		this.locationZip = locationZip;
		this.locationContact = locationContact;
		this.locationPhone = locationPhone;
	}

	public Location() {
		super();
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationStreetAddress() {
		return locationStreetAddress;
	}

	public void setLocationStreetAddress(String locationStreetAddress) {
		this.locationStreetAddress = locationStreetAddress;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public String getLocationState() {
		return locationState;
	}

	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}

	public String getLocationCountry() {
		return locationCountry;
	}

	public void setLocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}

	public String getLocationZip() {
		return locationZip;
	}

	public void setLocationZip(String locationZip) {
		this.locationZip = locationZip;
	}

	public String getLocationContact() {
		return locationContact;
	}

	public void setLocationContact(String locationContact) {
		this.locationContact = locationContact;
	}

	public long getLocationPhone() {
		return locationPhone;
	}

	public void setLocationPhone(long locationPhone) {
		this.locationPhone = locationPhone;
	}

	/*public Trial getTrial() {
		return trial;
	}

	public void setTrial(Trial trial) {
		this.trial = trial;
	}*/

	public int getTrialId() {
		return trialId;
	}

	public void setTrialId(int trialId) {
		this.trialId = trialId;
	}

}
