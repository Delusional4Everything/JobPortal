package com.project.JobPortal.repositories;

import com.project.JobPortal.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {

}
