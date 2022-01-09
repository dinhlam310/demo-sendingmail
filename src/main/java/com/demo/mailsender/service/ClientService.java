package com.demo.mailsender.service;

import com.demo.mailsender.service.sdi.ClientSdi;

public interface ClientService {
    Boolean create(ClientSdi sdi);
}

