package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.TrialUrl;

@Repository
public interface TrialUrlRepository extends JpaRepository<TrialUrl, Integer> {

	@Query(value = "SELECT url_name FROM urls LIMIT ?1,100", nativeQuery = true)
	public List<String> fetchUrls(int limit);

	@Query(value = "SELECT url_name FROM urls", nativeQuery = true)
	public List<String> fetchAllUrls();
}
