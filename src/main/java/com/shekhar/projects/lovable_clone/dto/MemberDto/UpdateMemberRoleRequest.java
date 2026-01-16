package com.shekhar.projects.lovable_clone.dto.MemberDto;

import com.shekhar.projects.lovable_clone.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole role
) {
}
