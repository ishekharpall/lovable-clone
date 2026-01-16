package com.shekhar.projects.lovable_clone.controller;

import com.shekhar.projects.lovable_clone.Service.ProjectService;
import com.shekhar.projects.lovable_clone.dto.ProjectDto.ProjectRequest;
import com.shekhar.projects.lovable_clone.dto.ProjectDto.ProjectResponse;
import com.shekhar.projects.lovable_clone.dto.ProjectDto.ProjectSummaryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyAllProjects(){
     Long userId = 1L;
     return ResponseEntity.ok(projectService.getMyProjects(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id){
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getProjectById(id,userId));
    }

   @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest projectRequest){
       Long userId = 1L;
       return ResponseEntity.ok(projectService.createProject(projectRequest,userId));
   }


   @PatchMapping("/{id}")
   public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id, @RequestBody ProjectRequest projectRequest){
       Long userId = 1L;
       return ResponseEntity.ok(projectService.updateProject(id,projectRequest,userId));
   }

   @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDelete(@PathVariable Long id){
        Long userId = 1L;
        projectService.softDelete(id,userId);
        return ResponseEntity.noContent().build();
   }




}
