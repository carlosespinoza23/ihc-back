package com.fisi.classroom.app.repository;

import com.fisi.classroom.app.models.entity.PlanEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanEstudioRepository extends JpaRepository<PlanEstudio,Integer> {
}
