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
public class TechnologyStackMapper {

    public static TechnologyDto toTechnologyDto(Technology technology) {
        return new TechnologyDto()
                .setId(technology.getId())
                .setName(technology.getName())
                .setVendorName(technology.getVendorName())
                .setVersion(technology.getVersion());
    }

    public static List<TechnologyDto> toTechnologyStackDtoList(List<Technology> technologyStack) {
        List<TechnologyDto> technologyDtos = new ArrayList<>();
        technologyStack.stream().forEach(x -> technologyDtos.add(toTechnologyDto(x)));
        return technologyDtos;
    }

    public static List<Technology> toTechnologyStackList(List<TechnologyDto> technologyStack) {
        return null;
    }
}
