package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Patient;
import com.model.TrialCondition;

@Repository
public interface TrialConditionRepository extends JpaRepository<TrialCondition, Integer> {
	@Query(value = "SELECT t FROM TrialCondition t where trialId in :trialIds")
	public List<TrialCondition> getConditions(List<Integer> trialIds);
	
	@Query(value = "SELECT t FROM TrialCondition t where conditionId in :conditionIds")
	public List<TrialCondition> getTrials(List<Integer> conditionIds);
}