package com.milo.ee.controller;

import com.milo.ee.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/data")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/availability")
    public String isAvailable(){
        return "Working perfectly!";
    }

    @PostMapping("/people")
    public void getDataByPeople(@RequestParam("file")MultipartFile file){
        String fileName = file.getOriginalFilename();
        System.out.println(fileName); //Show file name by console
        dataService.calcDataPeople(file);
    }

    @PostMapping("/team")
    public void getDataByTeam(@RequestParam("file")MultipartFile file){
        dataService.calcDataTeam(file);

    }

}