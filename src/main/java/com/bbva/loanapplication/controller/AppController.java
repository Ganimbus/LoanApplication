package com.bbva.loanapplication.controller;

import com.bbva.loanapplication.model.Application;
import com.bbva.loanapplication.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Application")
public class AppController {
    @Autowired
    private AppRepository appRepository;

    @GetMapping("/all")
    public List<Application> getAllApplication(){
        return appRepository.findAll();
    }

    @PostMapping("/add")
    public List<Application> addApplication(@RequestBody List<Application> Application){
        return appRepository.saveAll(Application);
    }

    @DeleteMapping("/delete/{id_app}")
    public void deleteApplication(@PathVariable Long id_app){
        appRepository.deleteById(Math.toIntExact(id_app));
    }
}
