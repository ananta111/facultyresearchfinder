package com.claflin.facultyresearches.controller;

import com.claflin.facultyresearches.entity.Faculty;
import com.claflin.facultyresearches.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {


    @Autowired
    private FacultyService facultyService;

    @RequestMapping("/faculties")
    @CrossOrigin("http://localhost:3000")
    public List<Faculty> getAllFaculties(){
        return facultyService.getAllFaculties();
    }

    @RequestMapping("/faculties/{id}")
    public Faculty getFacultyById(@PathVariable long id){
        return facultyService.getFacultyById(id);
    }

    @RequestMapping(value = "/faculties", method = RequestMethod.POST)
    public void addFaculty(@RequestBody Faculty faculty){
        facultyService.addFaculty(faculty);
    }

    @RequestMapping(value = "/faculties", method = RequestMethod.PUT)
    public void updateFaculty(@RequestBody Faculty faculty){
        facultyService.updateFaculty(faculty);
    }

    @RequestMapping(value = "/faculties/{id}", method = RequestMethod.DELETE)
    public void deleteFaculty(@RequestBody @PathVariable long id){
        facultyService.deleteFaculty(id);
    }


}
