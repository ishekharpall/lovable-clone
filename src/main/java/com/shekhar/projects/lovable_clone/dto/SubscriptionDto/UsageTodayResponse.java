package com.shekhar.projects.lovable_clone.dto.SubscriptionDto;

public record UsageTodayResponse(
        int tokensUsed,
        int tokensLimit,
        int previewsRunning,
        int previewsLimit
) {
}
