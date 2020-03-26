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

    //this constructor will be used for repository injection via java config
    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    //this setter will be used for repository injection via java config
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
