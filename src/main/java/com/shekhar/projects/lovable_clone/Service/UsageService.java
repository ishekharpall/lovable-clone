package com.shekhar.projects.lovable_clone.Service;

import com.shekhar.projects.lovable_clone.dto.SubscriptionDto.PlanLimitsResponse;
import com.shekhar.projects.lovable_clone.dto.SubscriptionDto.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
