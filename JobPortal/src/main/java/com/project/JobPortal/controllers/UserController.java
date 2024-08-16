package com.project.JobPortal.controllers;

import com.project.JobPortal.entities.Enum.Role;
import com.project.JobPortal.entities.Enum.TechStackKeywords;
import com.project.JobPortal.entities.User;
import com.project.JobPortal.repositories.JobRepository;
import com.project.JobPortal.repositories.UserRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/JobSeeker")

public class UserController {

    @Autowired
    private UserRepository UserRepository;
    @Autowired
    private JobRepository JobRepository;

    @PostMapping("/addUser")
    private ResponseEntity<?> addUser(){
        UserRepository.save(new User());
        return ResponseEntity.ok().body("User added successfully");

    }

    @PostMapping("/deleteUser")
    private ResponseEntity<?> deleteUser(){
        UserRepository.delete(new User());
        return ResponseEntity.ok().body("User deleted successfully");

    }
    @GetMapping("/Jobs/{role}")
    private ResponseEntity<?> getAllJobs(@PathVariable Role role){
        if(role == Role.JOB_SEEKER){
            return ResponseEntity.ok().body(JobRepository.findAll());
        }
        return ResponseEntity.ok().body("Choose valid role");
    }
    @GetMapping("/JobSearch/{languageKeyword}")
    private ResponseEntity<?> JobSearch(@PathVariable TechStackKeywords languageKeyword){

    }


}
