package com.siyaka.mailservice.controller;

import com.siyaka.mailservice.EmailDetail;
import com.siyaka.mailservice.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SendMail {
    private final MailService emailService;

    @GetMapping("/sendEmail/{email}")
    public String sendEmail(@PathVariable String email) {
        emailService.sendSimpleEmail(email, "Welcome message", "Test Body");
        return "Email sent successfully!";
    }
    @PostMapping("/sendEmail")
    public String sendAnEmail(@RequestBody EmailDetail emailDetail) {
//        emailService.sendSimpleEmail("recipient@example.com", "Test Subject", "Test Body");
        if (emailDetail.hasDetails()) {
//            emailService.sendSimpleEmail(emailDetail.getRecipient(), emailDetail.getSubject(), emailDetail.getBody());
            return "Email sent successfully!";
        }
        return "Email not sent, some details missing!!";
    }
}
