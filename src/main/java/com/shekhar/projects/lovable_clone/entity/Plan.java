package com.shekhar.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id;

    String name;
    String stipePriceId;
    Integer maxProjects;
    Integer maxTokensByDay;
    Integer maxPreviews;
    Boolean unlimitedAI;

    Boolean active;


}
