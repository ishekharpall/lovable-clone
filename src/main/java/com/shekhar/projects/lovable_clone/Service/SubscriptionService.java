package com.shekhar.projects.lovable_clone.Service;

import com.shekhar.projects.lovable_clone.dto.SubscriptionDto.CheckoutRequest;
import com.shekhar.projects.lovable_clone.dto.SubscriptionDto.CheckoutResponse;
import com.shekhar.projects.lovable_clone.dto.SubscriptionDto.PortalResponse;
import com.shekhar.projects.lovable_clone.dto.SubscriptionDto.SubscriptionResponse;


public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

   PortalResponse openCustomerPortal(Long userId);
}
