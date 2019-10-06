package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Trial;

@Repository
public interface TrialRepository extends JpaRepository<Trial, Integer> {
	
	@Query(value = "SELECT trial_name FROM trials", nativeQuery = true)
	public List<String> fetchAllTrials();

	@Query(value = "SELECT t FROM Trial t where t.trialId in :trialId")
	public List<Trial> fetchAllTrialById(List<Integer> trialId);
	
}
