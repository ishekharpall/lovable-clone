package com.shekhar.projects.lovable_clone.entity;


import com.shekhar.projects.lovable_clone.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    int id;

    User user;
    Plan plan;

    String stipeSubscriptionId;
    SubscriptionStatus subscriptionStatus;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;

    boolean cancelAtPeriodEnd;

    Instant createdAt;
    Instant updatedAt;

}
