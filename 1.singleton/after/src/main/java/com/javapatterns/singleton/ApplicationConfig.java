package com.javapatterns.singleton;

public class ApplicationConfig {
    private final String applicationName;
    private final String environment;
    private static final ApplicationConfig INSTANCE = new ApplicationConfig();

    private ApplicationConfig() {
        System.out.println("Loading application configuration...");
        this.applicationName = "Pattern Practice";
        this.environment = "development";
    }

    public static ApplicationConfig getInstance() {
        return INSTANCE;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getEnvironment() {
        return environment;
    }
}
