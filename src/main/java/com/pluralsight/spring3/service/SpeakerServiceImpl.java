package com.pluralsight.spring3.service;

import com.pluralsight.spring3.model.Speaker;
import com.pluralsight.spring3.repository.MockSpeakerRepositoryImpl;
import com.pluralsight.spring3.repository.SpeakerRespository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRespository repository = new MockSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
