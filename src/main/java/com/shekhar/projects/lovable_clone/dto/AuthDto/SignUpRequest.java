package com.shekhar.projects.lovable_clone.dto.AuthDto;

public record SignUpRequest(
        String name,
        String email,
        String password
) {
}
