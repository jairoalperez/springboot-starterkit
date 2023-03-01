package com.starterkit.springboot.brs.dto.mapper;

import com.starterkit.springboot.brs.dto.model.bootcamp.SessionDto;
import com.starterkit.springboot.brs.dto.model.bootcamp.TechnologyDto;
import com.starterkit.springboot.brs.dto.model.user.RoleDto;
import com.starterkit.springboot.brs.model.bootcamp.Session;
import com.starterkit.springboot.brs.model.bootcamp.Technology;
import com.starterkit.springboot.brs.model.user.Role;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arpit Khandelwal.
 */
@Component
public class TecnologyStackMapper {

    public static SessionDto toSessionDto(Session session) {
        return new SessionDto()
                .setId(session.getId())
                .setName(session.getName())
                .setSessionDate(session.getSessionDate())
                .setSessionItems(SessionItemMapper.toSessionDtoList(session.getSessionItems()));
    }

    public static Role toRole(RoleDto role) {
        return new Role()
                .setRole(role.getRole())
                .setId(role.getId());
    }

    public static List<SessionDto> toSessionDtoList(List<Session> sessions) {
        List<SessionDto> sessionDtos = new ArrayList<>();
        sessions.stream().forEach(x -> sessionDtos.add(toSessionDto(x)));
        return sessionDtos;
    }

    public static List<TechnologyDto> toTechnologyStackDtoList(List<Technology> technologyStack) {
        List<TechnologyDto> technologyDtos = new ArrayList<>();
        technologyDtos.stream().forEach(x -> technologyDtos.add(x));
        return technologyDtos;
    }

    public static List<Technology> toTechnologyStackList(List<TechnologyDto> technologyStack) {
        List<Technology> technologyDtos = new ArrayList<>();
        technologyDtos.stream().forEach(x -> technologyDtos.add(x));
        return technologyDtos;
    }
}
