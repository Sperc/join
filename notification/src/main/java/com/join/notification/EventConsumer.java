package com.join.notification;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface EventConsumer {
    String ADD_USER_HANDLER = "add-user-handler";

    @Input(EventConsumer.ADD_USER_HANDLER)
    SubscribableChannel addUserHandler();
}
