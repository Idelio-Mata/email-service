package com.mata.emailservice.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
