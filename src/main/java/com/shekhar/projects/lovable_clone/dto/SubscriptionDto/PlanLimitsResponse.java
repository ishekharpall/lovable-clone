package com.shekhar.projects.lovable_clone.dto.SubscriptionDto;

public record PlanLimitsResponse(
        String planName,
        int maxTokensPerDay,
        int maxProjects,
        boolean unlimitedAi
) {
}
