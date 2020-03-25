package com.ab.service;

import com.ab.model.Speaker;
import com.ab.repository.HibernateSpeakerRepositoryImpl;
import com.ab.repository.SpeakerRepository;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
