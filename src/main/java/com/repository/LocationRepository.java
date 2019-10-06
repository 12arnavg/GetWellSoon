package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

	@Query(value = "SELECT t FROM Location t where trialId in :trialIds")
	List<Location> findAllByTrialIds(List<Integer> trialIds);

}
