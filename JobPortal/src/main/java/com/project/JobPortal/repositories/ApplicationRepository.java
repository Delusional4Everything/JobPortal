package com.project.JobPortal.repositories;

import com.project.JobPortal.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application,Long> {

}
