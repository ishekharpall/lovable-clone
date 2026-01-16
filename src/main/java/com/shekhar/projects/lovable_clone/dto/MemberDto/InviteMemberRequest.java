package com.shekhar.projects.lovable_clone.dto.MemberDto;

import com.shekhar.projects.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
