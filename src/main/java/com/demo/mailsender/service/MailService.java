package com.demo.mailsender.service;

import com.demo.mailsender.dto.DataMailDTO;

import javax.mail.MessagingException;

public interface MailService {
    void sendHtmlMail(DataMailDTO dataMail, String templateName) throws MessagingException;
}
