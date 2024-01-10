package com.leadify.crm.controller;

import java.util.List;
import com.leadify.crm.entity.Interested;
import com.leadify.crm.service.InterestedService;

import lombok.extern.slf4j.Slf4j; // Import the Lombok @Slf4j annotation

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = { "http://localhost:8080" })
@RequestMapping("api/interested")
@Slf4j // Add the @Slf4j annotation
public class FinancialController {

    @Autowired
    private InterestedService interestedService;

    @GetMapping("/getAll")
    public List<Interested> getAll() {
        return interestedService.getInterested();
    }

    @PostMapping("/create")
    public void receiveRequestBody(@RequestBody String requestBody) {
        System.out.println("Received request body: " + requestBody);
        // Process the request body as needed
    }
    // public void create(@RequestBody Interested interested) {
    // System.out.println(interested);
    // interestedService.save(interested);
    // }

}
