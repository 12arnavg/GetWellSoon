package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "interventions")
public class Intervention {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int interventionId;

	private String interventionName;
/*
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "trials_interventions", joinColumns = @JoinColumn(name = "interventionId"), inverseJoinColumns = @JoinColumn(name = "trialId"))
	private Trial trial;
*/
	public int getInterventionId() {
		return interventionId;
	}

	public void setInterventionId(int interventionId) {
		this.interventionId = interventionId;
	}

	public String getInterventionName() {
		return interventionName;
	}

	public void setInterventionName(String interventionName) {
		this.interventionName = interventionName;
	}

/*	public Trial getTrial() {
		return trial;
	}

	public void setTrial(Trial trial) {
		this.trial = trial;
	}*/
}
