package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trials_conditions")
public class TrialCondition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int trialId;
	
	/*@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="condition_id",referencedColumnName = "conditionId")
	private Condition condition;*/
	
	private int conditionId;
	
	public int getTrialId() {
		return trialId;
	}
	public void setTrialId(int trialId) {
		this.trialId = trialId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getConditionId() {
		return conditionId;
	}
	public void setConditionId(int conditionId) {
		this.conditionId = conditionId;
	}
	
	
}
