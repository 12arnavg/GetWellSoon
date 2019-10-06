package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Condition;
import com.model.Location;

@Repository
public interface ConditionRepository extends JpaRepository<Condition, Integer> {
	@Query(value = "SELECT c FROM Condition c where conditionName like :conditionName")
	List<Condition> findAllByCondition(String conditionName); 
}
