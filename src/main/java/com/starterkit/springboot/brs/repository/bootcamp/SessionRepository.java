package com.starterkit.springboot.brs.repository.bootcamp;

import com.starterkit.springboot.brs.model.bootcamp.Session;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionRepository extends MongoRepository<Session, String> {

    List<Session> findByName(String name);
}
