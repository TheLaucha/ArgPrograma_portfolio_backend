package com.LautaroEspinillo.Portfolio.security.service;

import com.LautaroEspinillo.Portfolio.model.Project;
import com.LautaroEspinillo.Portfolio.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepo projectRepo;

    @Autowired
    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public Project addProject(Project project){
        return projectRepo.save(project);
    }

    public List<Project> findAllProjects(){
        return projectRepo.findAll();
    }

    public Project updateProject(Project project){
        return projectRepo.save(project);
    }

    public void deleteProject(Long id){
        projectRepo.deleteById(id);
    }

    public Project findProject(Long id){
        return projectRepo.findById(id).orElse(null);
    }
}
