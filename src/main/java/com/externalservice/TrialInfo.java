package com.externalservice;

import com.model.Trial;

public class TrialInfo {

	private String name;
	private String id;
	private String purpose;
	private String sponsor;
	private int phase;
	private String[] interventionList;
	private String gender;
	private int minage;
	private int maxage;
	private int participants;
	private String type;
	private String[] conditionList;
	private LocationDTO[] locationList;
	private String[] inclusionCriteria;
	private String[] exclusionCriteria;
	private String urlName;

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	private Trial trial;

	public Trial getTrial() {
		return trial;
	}

	public void setTrial(Trial trial) {
		this.trial = trial;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getInterventionList() {
		return interventionList;
	}

	public void setInterventionList(String[] interventionList) {
		this.interventionList = interventionList;
	}

	public TrialInfo(String name, String id, String purpose, String sponsor, int phase, String[] interventionList,
			String gender, int minage, int maxage, int participants, String type, String[] conditionList,
			LocationDTO[] locationList, String[] inclusionCriteria, String[] exclusionCriteria, String urlName) {
		super();
		this.name = name;
		this.id = id;
		this.purpose = purpose;
		this.sponsor = sponsor;
		this.phase = phase;
		this.interventionList = interventionList;
		this.gender = gender;
		this.minage = minage;
		this.maxage = maxage;
		this.participants = participants;
		this.type = type;
		this.conditionList = conditionList;
		this.locationList = locationList;
		this.inclusionCriteria = inclusionCriteria;
		this.exclusionCriteria = exclusionCriteria;
		this.urlName = urlName;
	}

	public String[] getConditionList() {
		return conditionList;
	}

	public void setConditionList(String[] conditionList) {
		this.conditionList = conditionList;
	}

	public LocationDTO[] getLocationList() {
		return locationList;
	}

	public void setLocationList(LocationDTO[] locationList) {
		this.locationList = locationList;
	}

	public TrialInfo() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public int getPhase() {
		return phase;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}

	public String[] getInterventions() {
		return interventionList;
	}

	public void setInterventions(String[] interventionList) {
		this.interventionList = interventionList;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMinage() {
		return minage;
	}

	public void setMinage(int minage) {
		this.minage = minage;
	}

	public int getMaxage() {
		return maxage;
	}

	public void setMaxage(int maxage) {
		this.maxage = maxage;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getConditions() {
		return conditionList;
	}

	public void setConditions(String[] conditionList) {
		this.conditionList = conditionList;
	}

	public String[] getInclusions() {
		return inclusionCriteria;
	}

	public void setInclusions(String[] inclusionCriteria) {
		this.inclusionCriteria = inclusionCriteria;
	}

	public String[] getExclusions() {
		return exclusionCriteria;
	}

	public void setExclusions(String[] exclusionCriteria) {
		this.exclusionCriteria = exclusionCriteria;
	}
}
