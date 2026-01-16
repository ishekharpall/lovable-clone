package com.shekhar.projects.lovable_clone.Service;

import com.shekhar.projects.lovable_clone.dto.MemberDto.InviteMemberRequest;
import com.shekhar.projects.lovable_clone.dto.MemberDto.MemberResponse;
import com.shekhar.projects.lovable_clone.entity.ProjectMember;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest inviteMemberRequest, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
