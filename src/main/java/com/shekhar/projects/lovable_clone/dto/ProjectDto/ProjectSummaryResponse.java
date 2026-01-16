package com.shekhar.projects.lovable_clone.dto.ProjectDto;

import java.time.Instant;

public record ProjectSummaryResponse(
    Long id,
    String name,
    Instant createdAt,
    Instant updatedAt
) {
}
