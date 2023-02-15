package com.starterkit.springboot.brs.dto.mapper;

import com.starterkit.springboot.brs.dto.model.user.RoleDto;
import com.starterkit.springboot.brs.dto.model.user.UserDto;
import com.starterkit.springboot.brs.dto.model.user.UserProfileDto;
import com.starterkit.springboot.brs.model.user.Role;
import com.starterkit.springboot.brs.model.user.User;
import com.starterkit.springboot.brs.model.user.UserProfile;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * Created by Arpit Khandelwal.
 */
@Component
public class RoleMapper {

    public static RoleDto toRoleDto(Role role) {
        return new RoleDto()
                .setRole(role.getRole())
                .setId(role.getId());
    }

    public static Role toRole(RoleDto role) {
        return new Role()
                .setRole(role.getRole())
                .setId(role.getId());
    }
}
