package com.project.JobPortal.services;

import com.project.JobPortal.entities.Application;
import com.project.JobPortal.entities.User;

import java.util.Set;

public interface ApplicationService {

    Application saveApplication(Application application);
    Application updateApplication(Application application);
    void deleteApplication(long id);
    Application getApplication(long id);
    Set<Application> getAllApplication();
}
