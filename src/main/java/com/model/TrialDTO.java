package com.model;

import java.util.ArrayList;
import java.util.List;

public class TrialDTO {

	private int trialId;

	private String trialName;

	private String trialType;

	private String trialUniqueId;

	private String trialSponsor;

	private int trialParticipantCount;

	private int trialMaxAge;

	private int trialMinAge;

	private String trialGender;

	private int trialPhase;

	private String trialPurpose;

	private List<Condition> conditions = new ArrayList<>();

	private TrialUrl trialUrl;

	private List<Location> locations = new ArrayList<>();

	public TrialDTO(Trial trial) {
		super();
		this.trialId = trial.getTrialId();
		this.trialName = trial.getTrialName();
		this.trialType = trial.getTrialType();
		this.trialUniqueId = trial.getTrialUniqueId();
		this.trialSponsor = trial.getTrialSponsor();
		this.trialParticipantCount = trial.getTrialParticipantCount();
		this.trialMaxAge = trial.getTrialMaxAge();
		this.trialMinAge = trial.getTrialMinAge();
		this.trialGender = trial.getTrialGender();
		this.trialPhase = trial.getTrialPhase();
		this.trialPurpose = trial.getTrialPurpose();
	}

	public TrialDTO() {

	}

	public int getTrialId() {
		return trialId;
	}

	public void setTrialId(int trialId) {
		this.trialId = trialId;
	}

	public String getTrialName() {
		return trialName;
	}

	public void setTrialName(String trialName) {
		this.trialName = trialName;
	}

	public String getTrialType() {
		return trialType;
	}

	public void setTrialType(String trialType) {
		this.trialType = trialType;
	}

	public String getTrialUniqueId() {
		return trialUniqueId;
	}

	public void setTrialUniqueId(String trialUniqueId) {
		this.trialUniqueId = trialUniqueId;
	}

	public String getTrialSponsor() {
		return trialSponsor;
	}

	public void setTrialSponsor(String trialSponsor) {
		this.trialSponsor = trialSponsor;
	}

	public int getTrialParticipantCount() {
		return trialParticipantCount;
	}

	public void setTrialParticipantCount(int trialParticipantCount) {
		this.trialParticipantCount = trialParticipantCount;
	}

	public int getTrialMaxAge() {
		return trialMaxAge;
	}

	public void setTrialMaxAge(int trialMaxAge) {
		this.trialMaxAge = trialMaxAge;
	}

	public int getTrialMinAge() {
		return trialMinAge;
	}

	public void setTrialMinAge(int trialMinAge) {
		this.trialMinAge = trialMinAge;
	}

	public String getTrialGender() {
		return trialGender;
	}

	public void setTrialGender(String trialGender) {
		this.trialGender = trialGender;
	}

	public int getTrialPhase() {
		return trialPhase;
	}

	public void setTrialPhase(int trialPhase) {
		this.trialPhase = trialPhase;
	}

	public String getTrialPurpose() {
		return trialPurpose;
	}

	public void setTrialPurpose(String trialPurpose) {
		this.trialPurpose = trialPurpose;
	}

	public List<Condition> getConditions() {
		return conditions;
	}

	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}

	public TrialUrl getTrialUrl() {
		return trialUrl;
	}

	public void setTrialUrl(TrialUrl trialUrl) {
		this.trialUrl = trialUrl;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

}
