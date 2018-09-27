package com.claflin.facultyresearches.service;


import com.claflin.facultyresearches.entity.Faculty;
import com.claflin.facultyresearches.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;


    public List<Faculty> getAllFaculties(){
        List<Faculty> faculties = new ArrayList<>();
        facultyRepository.findAll().forEach(faculties::add);
        return faculties;
    }

    public Faculty getFacultyById(long id){
        Optional<Faculty> facultyOptional= facultyRepository.findById(id);
        return facultyOptional.get();
    }

    public void addFaculty(Faculty faculty){
        facultyRepository.save(faculty);
    }

    public void updateFaculty(Faculty faculty){
        facultyRepository.save(faculty);
    }

    public void deleteFaculty(long id){
        facultyRepository.deleteById(id);
    }
}
