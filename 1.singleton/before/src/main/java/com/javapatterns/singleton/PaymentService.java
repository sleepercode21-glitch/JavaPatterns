package com.javapatterns.singleton;

public class PaymentService {
    private final ApplicationConfig config = new ApplicationConfig();

    public ApplicationConfig getConfig() {
        return config;
    }
}
