package com.project.JobPortal.services;

import com.project.JobPortal.entities.Job;
import com.project.JobPortal.entities.User;

import java.util.Set;

public interface JobService {

    Job saveJob(Job job);
    Job updateJob(Job job);
    void deleteJob(long id);
    Job getJob(long id);
    Set<Job> getAllJobs();
}
