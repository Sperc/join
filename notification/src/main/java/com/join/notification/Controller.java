package com.join.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller {
    private final JavaMailSender mailSender;

    @GetMapping()
    public void test() {
        log.info("Controller");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("katarzynawidz95@gmail.com");
        message.setSubject("Temat");
        message.setText("działa");
        mailSender.send(message);
    }
}
