package com.starterkit.springboot.brs.dto.model.bootcamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)

public class Session {
    String id;
    String name;
    Date SessionDate;
    List<SessionItem> sessionItems;
}