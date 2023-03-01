package com.starterkit.springboot.brs.controller.v1.request.bootcamp;

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

public class Session {
    String id;
    String name;
    Date SessionDate;
    List<SessionItem> sessionItems;
}
