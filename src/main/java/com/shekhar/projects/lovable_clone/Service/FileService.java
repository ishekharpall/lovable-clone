package com.shekhar.projects.lovable_clone.Service;

import com.shekhar.projects.lovable_clone.dto.ProjectDto.FileContentResponse;
import com.shekhar.projects.lovable_clone.dto.ProjectDto.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
     List<FileNode> getFileTree(Long projectId, Long userId);

     FileContentResponse getFile(Long projectId, String path, Long userid);
}
