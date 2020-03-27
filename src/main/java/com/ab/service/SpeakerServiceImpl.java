package com.ab.service;

import com.ab.model.Speaker;
import com.ab.repository.HibernateSpeakerRepositoryImpl;
import com.ab.repository.SpeakerRepository;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */

public class SpeakerServiceImpl implements SpeakerService {
    //This is the hardcoded injection need to do if we don't use Spring
    //private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
