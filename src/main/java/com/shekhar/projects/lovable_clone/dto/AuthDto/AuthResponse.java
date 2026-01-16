package com.shekhar.projects.lovable_clone.dto.AuthDto;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {
}
