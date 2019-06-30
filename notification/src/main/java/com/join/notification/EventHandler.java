package com.join.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EventHandler {
    private final EmailSender emailSender;

    @StreamListener(value = EventConsumer.ADD_USER_HANDLER)
    public void sendEmailListener(AddUserEvent emailEvent) {
        log.info("Receive event: {}", emailEvent);
        emailSender.sendEmailAfterAddUser(emailEvent);
    }
}
