package com.starterkit.springboot.brs.repository.bootcamp;

import com.starterkit.springboot.brs.model.bootcamp.Technology;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnologyRepository extends MongoRepository<Technology, String> {

    List<Technology> findByName(String name);
}
