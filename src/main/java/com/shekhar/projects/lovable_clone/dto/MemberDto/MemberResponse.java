package com.shekhar.projects.lovable_clone.dto.MemberDto;

import com.shekhar.projects.lovable_clone.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant requestedAt


) {
}
