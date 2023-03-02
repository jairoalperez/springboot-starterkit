package com.starterkit.springboot.brs.service;

import com.starterkit.springboot.brs.dto.mapper.TechnologyStackMapper;
import com.starterkit.springboot.brs.dto.model.bootcamp.TechnologyDto;
import com.starterkit.springboot.brs.repository.bootcamp.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TechnologyService implements ITechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;

    @Override
    public List<TechnologyDto> getAllTech() {
        return TechnologyStackMapper.toTechnologyStackDtoList(technologyRepository.findAll());
    }

    @Override
    public Optional<TechnologyDto> getById(String id) {
        return Optional.empty();
    }

    @Override
    public List<TechnologyDto> getByName(String name) {
        return null;
    }

    @Override
    public List<TechnologyDto> getAllTechByUser(String email) {
        return null;
    }
}
