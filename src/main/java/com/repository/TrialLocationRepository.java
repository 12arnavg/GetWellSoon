package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.TrialLocation;

@Repository
public interface TrialLocationRepository extends JpaRepository<TrialLocation, Integer> {
	@Query(value = "SELECT t FROM TrialLocation t where trialId in :trialIds")
	public List<TrialLocation> getLocations(List<Integer> trialIds);
}