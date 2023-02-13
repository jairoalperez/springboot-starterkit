package com.starterkit.springboot.brs.model.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Embedded;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "userProfile")
public class UserProfile {
    @Id
    private  String id;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private  String name;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String linkedIn;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String github;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private  String stackOverflow;
    @Embedded
    private Set<Experience> experience;
    @Embedded
    private Set<Education> education;
    @Embedded
    private Set<Skill> skills;
    @Embedded
    private  Set<Project> projects;

}
