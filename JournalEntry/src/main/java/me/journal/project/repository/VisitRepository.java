package me.journal.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.journal.project.entity.Visit;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Integer>{
	

}
