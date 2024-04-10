package com.pluralsight.spring3.repository;

import com.pluralsight.spring3.model.Speaker;

import java.util.List;

public interface SpeakerRespository {
    List<Speaker> findAll();
}
