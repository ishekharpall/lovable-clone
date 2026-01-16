package com.shekhar.projects.lovable_clone.dto.ProjectDto;

import com.shekhar.projects.lovable_clone.dto.AuthDto.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedId,
        UserProfileResponse owner
) {
}
