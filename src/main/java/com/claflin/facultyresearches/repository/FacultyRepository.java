package com.claflin.facultyresearches.repository;

import com.claflin.facultyresearches.entity.Faculty;
import com.claflin.facultyresearches.entity.ResearchProject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacultyRepository extends CrudRepository<Faculty, Long> {


}
