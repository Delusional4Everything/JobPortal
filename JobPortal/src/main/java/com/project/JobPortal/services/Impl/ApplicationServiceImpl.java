package com.project.JobPortal.services.Impl;

import com.project.JobPortal.entities.Application;
import com.project.JobPortal.repositories.ApplicationRepository;
import com.project.JobPortal.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }

    @Override
    public Application updateApplication(Application application) {
        return applicationRepository.save(application);
    }

    @Override
    public void deleteApplication(long id) {
        applicationRepository.deleteById(id);

    }

    @Override
    public Application getApplication(long id) {
        return applicationRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Application> getAllApplication() {
        return new HashSet<>(applicationRepository.findAll());
    }
}
