package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "trials")
public class Trial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trialId;

	// private Date updatedOn;

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

	/*@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "trials_conditions", joinColumns = @JoinColumn(name = "trialId"), inverseJoinColumns = @JoinColumn(name = "conditionId"))
	@LazyCollection(LazyCollectionOption.FALSE)*/
	@Transient
	private List<Condition> conditions = new ArrayList<>();
/*
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "trial")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Location> locations = new ArrayList<>();

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(name = "trials_interventions", joinColumns = @JoinColumn(name = "trialId"), inverseJoinColumns = @JoinColumn(name = "interventionId"))
	private List<Intervention> interventions = new ArrayList<>();
*/
	@OneToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "trial_url_id")
	private TrialUrl trialUrl;
	
/*	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "trial")
	@LazyCollection(LazyCollectionOption.FALSE)*/
	@Transient
	private List<Location> locations = new ArrayList<>();
	
	// private boolean isActive;

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

	public Trial() {
		super();
	}

	public Trial(int trialId, Date updatedOn, String trialName, String trialType, String trialUniqueId,
			String trialSponsor, int trialParticipantCount, int trialMaxAge, int trialMinAge, String trialGender,
			boolean isActive, List<Condition> conditions, List<Location> locations, int trialPhase, String trialPurpose) {
		super();
		this.trialId = trialId;
		// this.updatedOn = updatedOn;
		this.trialName = trialName;
		this.trialType = trialType;
		this.trialUniqueId = trialUniqueId;
		this.trialSponsor = trialSponsor;
		this.trialParticipantCount = trialParticipantCount;
		this.trialMaxAge = trialMaxAge;
		this.trialMinAge = trialMinAge;
		this.trialGender = trialGender;
		// this.isActive = isActive;
		//this.conditions = conditions;
		this.trialPhase = trialPhase;
		this.trialPurpose = trialPurpose;
		this.locations = locations;
	}

	public int getTrialId() {
		return trialId;
	}

	public void setTrialId(int trialId) {
		this.trialId = trialId;
	}

	/*
	 * public Date getUpdatedOn() { return updatedOn; }
	 * 
	 * public void setUpdatedOn(Date updatedOn) { this.updatedOn = updatedOn; }
	 */

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

	/*
	 * public boolean isActive() { return isActive; }
	 * 
	 * public void setActive(boolean isActive) { this.isActive = isActive; }
	 */

	public List<Condition> getConditions() {
		return conditions;
	}

	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

}
