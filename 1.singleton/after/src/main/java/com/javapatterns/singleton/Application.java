package com.javapatterns.singleton;

public class Application {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        System.out.println("Application: " + orderService.getConfig().getApplicationName());
        System.out.println("Environment: " + paymentService.getConfig().getEnvironment());
        System.out.println(
                "Services share configuration: "
                        + (orderService.getConfig() == paymentService.getConfig()));
    }
}
