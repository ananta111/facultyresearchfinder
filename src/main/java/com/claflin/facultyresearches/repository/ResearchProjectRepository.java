package com.claflin.facultyresearches.repository;

import com.claflin.facultyresearches.entity.ResearchProject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ResearchProjectRepository extends CrudRepository<ResearchProject,Long> {

    Iterable<ResearchProject> findResearchProjectsByFaculty_Id(long fId);

}

