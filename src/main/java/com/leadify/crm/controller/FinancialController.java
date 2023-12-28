package com.leadify.crm.controller;

import java.util.List;
import com.leadify.crm.entity.Interested;
import com.leadify.crm.service.InterestedService;

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
public class FinancialController {

    @Autowired
    private InterestedService interestedService;

    @GetMapping("/getAll")
    public List<Interested> getAll() {
        return interestedService.getInterested();
    }

    @PostMapping("/create")
    public void create(@RequestBody Interested interested) {
        interestedService.save(interested);
    }
}
