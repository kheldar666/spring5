package org.libermundi.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    public static final String HELLO_GURUS = "Hello Gurus !!!";

    @Override
    public String sayGreetings() {
        return HELLO_GURUS + " - from Setter Greeting Service";
    }
}
