package com.pluralsight.spring3.repository;

import com.pluralsight.spring3.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class MockSpeakerRepositoryImpl implements SpeakerRespository{

    @Override
    public List<Speaker> findAll () {
        List<Speaker> listOfSpeakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Venkata");
        speaker.setLastName("Sunkara");
        listOfSpeakers.add(speaker);
        return listOfSpeakers;
    }
}
