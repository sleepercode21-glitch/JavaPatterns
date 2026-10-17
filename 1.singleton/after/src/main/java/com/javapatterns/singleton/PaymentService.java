package com.javapatterns.singleton;

public class PaymentService {
    private final ApplicationConfig config = ApplicationConfig.getInstance();

    public ApplicationConfig getConfig() {
        return config;
    }
}
