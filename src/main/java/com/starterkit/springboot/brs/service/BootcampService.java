package com.starterkit.springboot.brs.service;

import com.starterkit.springboot.brs.dto.mapper.BootcampMapper;
import com.starterkit.springboot.brs.dto.mapper.RoleMapper;
import com.starterkit.springboot.brs.dto.mapper.UserMapper;
import com.starterkit.springboot.brs.dto.model.bootcamp.BootcampDto;
import com.starterkit.springboot.brs.dto.model.user.RoleDto;
import com.starterkit.springboot.brs.model.bootcamp.Bootcamp;
import com.starterkit.springboot.brs.model.user.User;
import com.starterkit.springboot.brs.repository.bootcamp.BootcampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static com.starterkit.springboot.brs.exception.EntityType.BOOTCAMP;
import static com.starterkit.springboot.brs.exception.ExceptionType.ENTITY_NOT_FOUND;

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
    public boolean updateBootcamp(BootcampDto bootcampDto) {
        Optional<List<Bootcamp>> bootcamp = Optional.ofNullable(bootcampRepository.findByName(bootcampDto.getName()));

        if (bootcamp.isPresent()) {
            List<Bootcamp> bootcamps = bootcamp.get();
            for (Bootcamp b: bootcamps){
                if (b.getId().equals(bootcampDto.getId())) {
                    Bootcamp bootcampToSave= BootcampMapper.toBootcamp(bootcampDto);
                    BootcampMapper.toBootcampDto(bootcampRepository.save(bootcampToSave));
                    return true;
                }
            }
            // source -> userDto
            // destination ->  User
            // String role= bootcampDto.getRoles().stream().findFirst().get().getRole();
            // RoleDto roleDto= RoleMapper.toRoleDto( roleRepository.findByRole(role));
            // Set<RoleDto> roles = new HashSet<RoleDto>();
            // roles.add(roleDto);
            // userDto.setRoles(roles);
        }
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
