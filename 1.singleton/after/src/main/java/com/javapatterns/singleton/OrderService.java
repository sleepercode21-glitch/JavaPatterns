package com.javapatterns.singleton;

public class OrderService {
    private final ApplicationConfig config = ApplicationConfig.getInstance();

    public ApplicationConfig getConfig() {
        return config;
    }
}
