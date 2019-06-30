package com.join.notification;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface EventProducer {
    String ADD_USER = "add-user";

    @Output(EventProducer.ADD_USER)
    SubscribableChannel addUser();
}
