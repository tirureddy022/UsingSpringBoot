package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
