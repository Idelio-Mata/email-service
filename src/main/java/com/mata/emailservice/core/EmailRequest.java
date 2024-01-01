package com.mata.emailservice.core;

import javax.security.auth.Subject;

public record EmailRequest(String to, String subject, String body) {
}
