package com.javapatterns.singleton;

public class ApplicationConfig {
    private final String applicationName;
    private final String environment;

    public ApplicationConfig() {
        System.out.println("Loading application configuration...");
        this.applicationName = "Pattern Practice";
        this.environment = "development";
    }

    public static ApplicationConfig getInstance() {
        throw new UnsupportedOperationException("Implement the Singleton pattern");
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getEnvironment() {
        return environment;
    }
}
