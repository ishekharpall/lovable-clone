package com.shekhar.projects.lovable_clone.Service;

import com.shekhar.projects.lovable_clone.dto.SubscriptionDto.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
