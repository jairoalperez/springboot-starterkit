package com.starterkit.springboot.brs.dto.mapper;

import com.starterkit.springboot.brs.dto.model.bootcamp.SessionDto;
import com.starterkit.springboot.brs.dto.model.bootcamp.SessionItemDto;
import com.starterkit.springboot.brs.dto.model.user.RoleDto;
import com.starterkit.springboot.brs.model.bootcamp.Session;
import com.starterkit.springboot.brs.model.bootcamp.SessionItem;
import com.starterkit.springboot.brs.model.user.Role;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arpit Khandelwal.
 */
@Component
public class SessionItemMapper {

    public static SessionItemDto toSessionDto(SessionItem session) {
        return new SessionItemDto()
                .setId(session.getId())
                .setName(session.getName())
                .setDetails(session.getDetails())
                .setSessionLink(session.getSessionLink())
                .setSessionContentRecorded(session.getSessionContentRecorded())
                .setSessionType(session.getSessionType());

    }

    public static SessionItem toSession(SessionItemDto session) {
        return new SessionItem()
                .setId(session.getId())
                .setName(session.getName())
                .setDetails(session.getDetails())
                .setSessionLink(session.getSessionLink())
                .setSessionContentRecorded(session.getSessionContentRecorded())
                .setSessionType(session.getSessionType());

    }

    public static Role toRole(RoleDto role) {
        return new Role()
                .setRole(role.getRole())
                .setId(role.getId());
    }


    public static List<SessionItemDto> toSessionDtoList(List<SessionItem> sessionItems) {
        List<SessionItemDto> sessionItemDtos = new ArrayList<>();
        sessionItems.stream().forEach(x -> sessionItemDtos.add(toSessionDto(x)));
        return sessionItemDtos;

    }

    public static List<SessionItem> toSessionList(List<SessionItemDto> sessionItems) {
        List<SessionItem> sessionItemDtos = new ArrayList<>();
        sessionItems.stream().forEach(x -> sessionItemDtos.add(toSession(x)));
        return sessionItemDtos;

    }
}
