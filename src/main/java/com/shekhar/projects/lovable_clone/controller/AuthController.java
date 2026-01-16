package com.shekhar.projects.lovable_clone.controller;

import com.shekhar.projects.lovable_clone.Service.AuthService;
import com.shekhar.projects.lovable_clone.Service.UserService;
import com.shekhar.projects.lovable_clone.dto.AuthDto.AuthResponse;
import com.shekhar.projects.lovable_clone.dto.AuthDto.LoginRequest;
import com.shekhar.projects.lovable_clone.dto.AuthDto.SignUpRequest;
import com.shekhar.projects.lovable_clone.dto.AuthDto.UserProfileResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignUpRequest signUpRequest){
        return ResponseEntity.ok(authService.signup(signUpRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile() {
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }


}
