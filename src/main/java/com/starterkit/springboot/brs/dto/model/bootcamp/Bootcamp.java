package com.starterkit.springboot.brs.dto.model.bootcamp;

import com.starterkit.springboot.brs.model.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Embedded;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Bootcamp {
    String id;
    String name;
    Date startSate;
    Date endDate;
    String description;
    String longHtml;
    List<User> users;
    List<Technology> technologyStack;
    List <Session> sessions;
}
