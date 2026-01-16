package com.shekhar.projects.lovable_clone.Service;

import com.shekhar.projects.lovable_clone.dto.AuthDto.AuthResponse;
import com.shekhar.projects.lovable_clone.dto.AuthDto.LoginRequest;
import com.shekhar.projects.lovable_clone.dto.AuthDto.SignUpRequest;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    AuthResponse signup(SignUpRequest signUpRequest);

    AuthResponse login(LoginRequest loginRequest);
}
