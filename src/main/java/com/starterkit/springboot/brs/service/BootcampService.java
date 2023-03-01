package com.starterkit.springboot.brs.service;

import com.starterkit.springboot.brs.dto.mapper.BootcampMapper;
import com.starterkit.springboot.brs.dto.model.bootcamp.BootcampDto;
import com.starterkit.springboot.brs.repository.bootcamp.BootcampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BootcampService implements  IBootcampService {


    @Autowired
    BootcampRepository  bootcampRepository;

    // call the bootcamo Repository


    @Override
    public List<BootcampDto> getAllBootcamps() {
        return BootcampMapper.toBootcampDtoList(bootcampRepository.findAll());
    }

    @Override
    public Optional<BootcampDto> getById(String id) {
        return Optional.empty();
    }

    @Override
    public List<BootcampDto> getByName(String name) {
        return null;
    }

    @Override
    public List<BootcampDto> getAllBootcampsByUser(String email) {
        return null;
    }

    @Override
    public boolean createBootcamp(BootcampDto bootcamp) {
        return false;
    }

    @Override
    public boolean updateBootcamp(BootcampDto bootcamp) {
        return false;
    }

    @Override
    public boolean deleteBootcamp(String id) {
        return false;
    }

    @Override
    public List<BootcampDto> registerUserBootcamp(BootcampDto email) {
        return null;
    }
}
