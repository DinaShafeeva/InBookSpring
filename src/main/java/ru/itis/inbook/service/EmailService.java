package ru.itis.inbook.service;

public interface EmailService {
    void sendMail(String subject, String text, String email);
}
