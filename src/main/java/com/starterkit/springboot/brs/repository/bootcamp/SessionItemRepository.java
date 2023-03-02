package com.starterkit.springboot.brs.repository.bootcamp;

import com.starterkit.springboot.brs.model.bootcamp.Session;
import com.starterkit.springboot.brs.model.bootcamp.SessionItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionItemRepository extends MongoRepository<SessionItem, String> {

    List<Session> findByName(String name);
}
