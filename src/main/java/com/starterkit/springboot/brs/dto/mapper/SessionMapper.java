package com.starterkit.springboot.brs.dto.mapper;

import com.starterkit.springboot.brs.controller.v1.request.bootcamp.SessionRequest;
import com.starterkit.springboot.brs.dto.model.bootcamp.SessionDto;
import com.starterkit.springboot.brs.dto.model.user.RoleDto;
import com.starterkit.springboot.brs.model.bootcamp.Session;
import com.starterkit.springboot.brs.model.user.Role;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arpit Khandelwal.
 */
@Component
public class SessionMapper {

    public static SessionDto toSessionDto(Session session) {
        return new SessionDto()
                .setId(session.getId())
                .setName(session.getName())
                .setSessionDate(session.getSessionDate())
                .setSessionItems( SessionItemMapper.toSessionDtoList(session.getSessionItems()));
    }

    public static Session toSession(SessionDto session) {
        return new Session()
                .setId(session.getId())
                .setName(session.getName())
                .setSessionDate(session.getSessionDate())
                .setSessionItems( SessionItemMapper.toSessionList(session.getSessionItems()));
    }
    public static Session toSession(SessionRequest sessionRequest) {
        return new Session()
                .setId(sessionRequest.getId())
                .setName(sessionRequest.getName())
                .setSessionDate(sessionRequest.getSessionDate())
                .setSessionItems( SessionItemMapper.toSessionListFreq(sessionRequest.getSessionItems()));
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

    public static List<Session> toSessionList(List<SessionDto> sessions) {
        List<Session> sessionDtos = new ArrayList<>();
        sessions.stream().forEach(x -> sessionDtos.add(toSession(x)));
        return sessionDtos;
    }
}
