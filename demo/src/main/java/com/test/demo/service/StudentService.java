package com.test.demo.service;

import java.lang.System.Logger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.demo.Repository.StudentRepo;
import com.test.demo.student;

@Service
public class StudentService {
    @Autowired
    private StudentRepo stdRepo;

    // insert
    public student saveDetails(student std) {
        // Log.info("Student details to be saved: {}", std);

        return stdRepo.save(std);
    }
    // update
    public student updateDetails(student std) {
        // Log.info("Student details to be saved: {}", std);

        student updaStudent = stdRepo.findById(std.getId()).orElse(null);
        if (updaStudent != null) {
            updaStudent.setMark(std.getMark());
            updaStudent.setName(std.getName());
            stdRepo.save(updaStudent);
            return updaStudent;
        }

        // student updateStd = stdRepo.findById(std.getId()).orElse(null);
        // if (updateStd != null) {
        //     updateStd.setMark(std.getMark()); 
        //     updateStd.setName(std.getName());
        //     stdRepo.save(updateStd);
        //     return updateStd; }

        return null;
    }
    // get all data present in the database
    public List<student> getAllData()
    {
        return stdRepo.findAll();
    }
    // get student by id 
    public student getStdById(int id) {

        return stdRepo.findById(id).orElse(null);
    }
}
