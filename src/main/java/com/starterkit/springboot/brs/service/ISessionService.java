package com.starterkit.springboot.brs.service;

import com.starterkit.springboot.brs.dto.model.bootcamp.BootcampDto;
import com.starterkit.springboot.brs.dto.model.bootcamp.SessionDto;

import java.util.List;
import java.util.Optional;

public interface ISessionService {

    List<SessionDto> getAllSessions();
    Optional<SessionDto> getById(String id);
    List<SessionDto> getByName(String name);
    List<SessionDto> getAllSessionsByUser(String email);

}
