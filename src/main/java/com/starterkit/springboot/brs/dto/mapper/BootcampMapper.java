package com.starterkit.springboot.brs.dto.mapper;

import com.starterkit.springboot.brs.dto.model.bootcamp.BootcampDto;
import com.starterkit.springboot.brs.dto.model.bootcamp.SessionItemDto;
import com.starterkit.springboot.brs.dto.model.user.RoleDto;
import com.starterkit.springboot.brs.model.bootcamp.Bootcamp;
import com.starterkit.springboot.brs.model.user.Role;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arpit Khandelwal.
 */
@Component
public class BootcampMapper {

    public static BootcampDto toBootcampDto(Bootcamp bootcamp) {
        return new BootcampDto()
                .setId(bootcamp.getId())
                .setDescription(bootcamp.getDescription())
                .setEndDate(bootcamp.getEndDate())
                .setLongHtml(bootcamp.getLongHtml())
                .setName(bootcamp.getName())
                .setSessions(SessionMapper.toSessionDtoList(bootcamp.getSessions()))
                .setStartSate(bootcamp.getStartDate())
                .setTechnologyStack(TecnologyStackMapper.toTechnologyStackDtoList(bootcamp.getTechnologyStack()))
                .setUsers(bootcamp.getUsers());
    }

    public static Role toRole(RoleDto role) {
        return new Role()
                .setRole(role.getRole())
                .setId(role.getId());
    }

    public static List<BootcampDto> toBootcampDtoList(List<Bootcamp> all) {
        List<BootcampDto> bootcampDtos = new ArrayList<>();
        all.stream().forEach(x->{
            bootcampDtos.add(toBootcampDto(x));
        });
        return bootcampDtos;
    }
}
