package com.employmentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employmentcrud.entity.EmpDetails;

@Repository
public interface EmpRepository extends JpaRepository<EmpDetails, Long> {
	
}
