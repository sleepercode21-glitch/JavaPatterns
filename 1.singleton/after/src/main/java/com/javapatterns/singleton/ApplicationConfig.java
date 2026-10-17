package com.javapatterns.singleton;

public class ApplicationConfig {
    private final String applicationName;
    private final String environment;
    private static ApplicationConfig applicationConfig = null;

    private ApplicationConfig() {
        System.out.println("Loading application configuration...");
        this.applicationName = "Pattern Practice";
        this.environment = "development";
    }

    public static ApplicationConfig getInstance() {
        synchronized (ApplicationConfig.class) {
            if (applicationConfig == null) {
                applicationConfig = new ApplicationConfig();
            }
            return applicationConfig;
        }
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getEnvironment() {
        return environment;
    }
}
