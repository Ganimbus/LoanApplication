package com.bbva.loanservice.controller;

import com.bbva.loanservice.model.Application;
import com.bbva.loanservice.repository.LoanServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Application")
public class LoanServiceController {
    @Autowired
    private LoanServiceRepository loanServiceRepository;

    @GetMapping("/all")
    public List<Application> getAllApplication(){
        return loanServiceRepository.findAll();
    }

    @PostMapping("/add")
    public List<Application> addApplication(@RequestBody List<Application> Application){
        return loanServiceRepository.saveAll(Application);
    }

    @DeleteMapping("/delete/{id_app}")
    public void deleteApplication(@PathVariable Long id_app){
        loanServiceRepository.deleteById(Math.toIntExact(id_app));
    }
}
