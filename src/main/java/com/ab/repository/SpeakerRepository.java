package com.ab.repository;

import com.ab.model.Speaker;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public interface SpeakerRepository {
    List<Speaker> findAll();
}
