package com.LautaroEspinillo.Portfolio.controller;

import com.LautaroEspinillo.Portfolio.model.Project;
import com.LautaroEspinillo.Portfolio.security.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/projects")
public class ProjectResource {
    private final ProjectService projectService;

    public ProjectResource(ProjectService projectService){
        this.projectService = projectService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Project>> getAllProjects(){
        List<Project> projects = projectService.findAllProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable("id") Long id){
        Project project = projectService.findProject(id);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PostMapping("/add")
    public ResponseEntity<Project> addProject(@RequestBody Project project){
        Project newProject = projectService.addProject(project);
        return new ResponseEntity<>(newProject, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PutMapping("/update")
    public ResponseEntity<Project> updateProject(@RequestBody Project project){
        Project updateProject = projectService.updateProject(project);
        return new ResponseEntity<>(updateProject,HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id){
        projectService.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
