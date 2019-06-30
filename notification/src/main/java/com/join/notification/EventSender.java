package com.join.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EventSender {
    private final EventProducer eventProducer;

    public void sendEmailEventSend(AddUserEvent event) {
        Message<AddUserEvent> message = MessageBuilder.withPayload(event)
                                                      .build();
        log.info("Event before send");

        eventProducer.addUser()
                     .send(message);
        log.info("Event send:{}", event);
    }
}
