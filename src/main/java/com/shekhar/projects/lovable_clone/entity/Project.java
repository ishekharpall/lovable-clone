package com.shekhar.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {

    long id;

    String name;

    User owner;

    boolean isPublic =false;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt; //soft delete


}
