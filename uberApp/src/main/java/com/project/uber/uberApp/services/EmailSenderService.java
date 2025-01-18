package com.project.uber.uberApp.services;

public interface EmailSenderService {
    void sendMail(String toMail, String subject, String body);
    void sendMail(String toMail[], String subject, String body);
}
