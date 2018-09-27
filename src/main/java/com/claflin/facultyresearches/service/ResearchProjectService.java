package com.claflin.facultyresearches.service;

import com.claflin.facultyresearches.entity.ResearchProject;
import com.claflin.facultyresearches.repository.ResearchProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ResearchProjectService {


    @Autowired
    private ResearchProjectRepository projectRepository;

    public List<ResearchProject> getAllProjects(){
        List<ResearchProject> list = new ArrayList<>();
        projectRepository.findAll().forEach(list::add);
        return list;
    }

    public List<ResearchProject> getAllProjectsByFacultyId(long fId){
        List<ResearchProject> list = new ArrayList<>();
        projectRepository.findResearchProjectsByFaculty_Id(fId).forEach(list::add);
        return list;
    }

    public void addProject(ResearchProject project){
        projectRepository.save(project);
    }







}
