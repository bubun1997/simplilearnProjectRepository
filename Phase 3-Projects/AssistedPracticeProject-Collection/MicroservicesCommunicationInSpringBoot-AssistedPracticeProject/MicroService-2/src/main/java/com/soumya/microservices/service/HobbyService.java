package com.soumya.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumya.microservices.entity.HobbyEntity;
import com.soumya.microservices.repository.HobbyRepository;

@Service
public class HobbyService {

    @Autowired
    HobbyRepository hobbyRepository;
    
    public String findByPersonId(int personid){
        return hobbyRepository.findByPersonId(personid);
    }   
    public void addHobby(HobbyEntity he){
        hobbyRepository.save(he);
    }
}
