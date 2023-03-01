package com.starterkit.springboot.brs.dto.model.bootcamp;

import com.starterkit.springboot.brs.model.bootcamp.SessionType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class SessionItemDto {
    String id;
    SessionType sessionType;
    String name;
    String details;
    String sessionLink;
    String sessionContentRecorded;

}
