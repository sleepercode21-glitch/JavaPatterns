package com.javapatterns.singleton;

public class OrderService {
    private final ApplicationConfig config = new ApplicationConfig();

    public ApplicationConfig getConfig() {
        return config;
    }
}
