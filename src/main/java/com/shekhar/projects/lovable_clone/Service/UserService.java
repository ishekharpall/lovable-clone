package com.shekhar.projects.lovable_clone.Service;

import com.shekhar.projects.lovable_clone.dto.AuthDto.UserProfileResponse;

public interface UserService {
     UserProfileResponse getProfile(Long userId);
}
