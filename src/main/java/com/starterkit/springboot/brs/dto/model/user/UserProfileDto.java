package com.starterkit.springboot.brs.dto.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.starterkit.springboot.brs.model.user.Education;
import com.starterkit.springboot.brs.model.user.Experience;
import com.starterkit.springboot.brs.model.user.Project;
import com.starterkit.springboot.brs.model.user.Skill;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.persistence.Embedded;
import java.util.Set;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserProfileDto {
    private  String id;
    private  String name;
    private String linkedIn;
    private String github;
    private  String stackOverflow;
    private Set<Experience> experience;
    private Set<Education> education;
    private Set<Skill> skills;
    private  Set<Project> projects;
}
