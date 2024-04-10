package com.pluralsight.spring3.service;

import com.pluralsight.spring3.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
