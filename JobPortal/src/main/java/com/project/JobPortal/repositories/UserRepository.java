package com.project.JobPortal.repositories;

import com.project.JobPortal.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
