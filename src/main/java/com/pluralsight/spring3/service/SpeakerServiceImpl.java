package com.pluralsight.spring3.service;

import com.pluralsight.spring3.model.Speaker;
import com.pluralsight.spring3.repository.MockSpeakerRepositoryImpl;
import com.pluralsight.spring3.repository.SpeakerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Scope(value= BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRespository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRespository repository) {
        System.out.println("SpeakerServiceImpl args constructor");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRespository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
