package com.claflin.facultyresearches.controller;


import com.claflin.facultyresearches.entity.Faculty;
import com.claflin.facultyresearches.entity.ResearchProject;
import com.claflin.facultyresearches.service.FacultyService;
import com.claflin.facultyresearches.service.ResearchProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResearchProjectController {

    @Autowired
    private FacultyService facultyService;

    @Autowired
    private ResearchProjectService projectService;

    @RequestMapping("/projects")
    public List<ResearchProject> getProjects(){
        return projectService.getAllProjects();
    }

    @RequestMapping("/faculties/{fId}/projects")
    public List<ResearchProject> getProjectsByFacultyId(@PathVariable long fId){
        return projectService.getAllProjectsByFacultyId(fId);
    }

    @RequestMapping(value = "faculties/{fId}/projects",method = RequestMethod.POST)
    public void addProject(@RequestBody ResearchProject project, @PathVariable long fId){
        project.setFaculty(facultyService.getFacultyById(fId));
        projectService.addProject(project);
    }




}
