package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.student;
import com.test.demo.Repository.StudentRepo;
import com.test.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
    @Autowired
    private StudentService stdServ;

// enable postman to insert student data into database 
    @PostMapping("/addStd")
    // return type is string since there will be a msg after data is inserted
    public String postDetails(@RequestBody student std){
        stdServ.saveDetails( std);
        return "Posted details for student";

    }
    //enable postman to update student details
    @PutMapping("/updStd")
    public student updStdDetails(@RequestBody student std){
        return stdServ.updateDetails(std);

    }
    // to get ever students details as a list 
    @GetMapping("/getAllData")
    public List<student> getAllData(){
        return stdServ.getAllData();
    }
    // get students details whoes id is mentioned.
    @GetMapping("/getStdById/{id}")
    public student fetchDataById(@PathVariable int id){
        // fetch data by id
        return stdServ.getStdById(id);
    }
}

