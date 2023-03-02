package com.starterkit.springboot.brs.service;

import com.starterkit.springboot.brs.dto.model.bootcamp.BootcampDto;

import java.util.List;
import java.util.Optional;

public interface IBootcampService {


    List<BootcampDto> getAllBootcamps();
    Optional<BootcampDto> getById(String id);
    List<BootcampDto> getByName(String name);
    List<BootcampDto> getAllBootcampsByUser(String email);
    boolean createBootcamp(BootcampDto bootcamp);
    boolean updateBootcamp(BootcampDto bootcampDto);
    boolean deleteBootcamp(String id);

    List<BootcampDto> registerUserBootcamp(BootcampDto email);
}
