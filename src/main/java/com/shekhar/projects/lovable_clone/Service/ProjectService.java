package com.shekhar.projects.lovable_clone.Service;

import com.shekhar.projects.lovable_clone.dto.ProjectDto.ProjectRequest;
import com.shekhar.projects.lovable_clone.dto.ProjectDto.ProjectResponse;
import com.shekhar.projects.lovable_clone.dto.ProjectDto.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {

     List<ProjectSummaryResponse> getMyProjects(Long userId);

     ProjectResponse getProjectById(Long id, Long userId);

     ProjectResponse createProject(ProjectRequest projectRequest, Long userId);

     ProjectResponse updateProject(Long id, ProjectRequest projectRequest, Long userId);

     void softDelete(Long id, Long userId);

}
