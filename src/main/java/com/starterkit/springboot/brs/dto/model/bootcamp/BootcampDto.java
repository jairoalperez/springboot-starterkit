package com.starterkit.springboot.brs.dto.model.bootcamp;

import com.starterkit.springboot.brs.model.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class BootcampDto {
    String id;
    String name;
    Date startSate;
    Date endDate;
    String description;
    String longHtml;
    List<User> users;
    List<TechnologyDto> technologyStack;
    List <SessionDto> sessions;
}
