package com.leadify.crm.service;

import com.leadify.crm.entity.Interested;
import com.leadify.crm.repository.InterestedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestedService {

    @Autowired
    private InterestedRepository interestedRepository;

    public List<Interested> getInterested() {
        return interestedRepository.findAll();
    }

    public void save(Interested interested) {
        interestedRepository.save(interested);
    }
}