package com.join.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmailSender {
    private final JavaMailSender mailSender;

    public void sendEmailAfterAddUser(AddUserEvent event) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(event.getEmail());
        message.setSubject("Registration in Orlikapp");
        String txt = "Dear " + event.getFirstName() + " " + event.getLastName() + "\nYour account is created. Congratulations!";
        message.setText(txt);
        mailSender.send(message);
        log.info("Add user Email send to: {}", event.getEmail());

    }
}
