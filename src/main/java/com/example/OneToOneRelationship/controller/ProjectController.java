package com.example.OneToOneRelationship.controller;

import com.example.OneToOneRelationship.model.Project;
import com.example.OneToOneRelationship.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @PostMapping("/add")
    public Project addProject(@RequestBody Project project){
        return projectService.addProject(project);
}
}