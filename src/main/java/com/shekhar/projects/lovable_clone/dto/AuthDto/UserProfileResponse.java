package com.shekhar.projects.lovable_clone.dto.AuthDto;

public record UserProfileResponse(
        Long id,
        String name,
        String email,
        String avatarUrl
) {
}
