package com.shekhar.projects.lovable_clone.dto.ProjectDto;

import java.time.Instant;

public record FileNode(
        String path,
        Instant modifiedAt,
        Long size,
        String type
) {
}
