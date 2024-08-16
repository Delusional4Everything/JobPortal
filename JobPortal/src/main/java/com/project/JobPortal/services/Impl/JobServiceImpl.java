package com.project.JobPortal.services.Impl;

import com.project.JobPortal.entities.Job;
import com.project.JobPortal.repositories.JobRepository;
import com.project.JobPortal.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public Job updateJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public void deleteJob(long id) {
        jobRepository.deleteById(id);
    }

    @Override
    public Job getJob(long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Job> getAllJobs() {
        return new HashSet<Job>(jobRepository.findAll()) ;
    }
}
