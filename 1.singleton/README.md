# Singleton Exercise: Application Configuration

## Learning goal

Practice recognizing when an application needs exactly one shared instance and refactor the code using the Singleton pattern.

Do not start by memorizing Singleton syntax. First observe the problem in the `before` application, then implement your solution in `after`.

## Scenario

An application loads configuration containing its name and environment. Several services need access to the same configuration.

The current implementation allows every service to create its own `ApplicationConfig` object. Loading configuration is intended to represent an expensive operation, so creating it repeatedly wastes resources. It can also produce inconsistent application state if different objects are changed independently.

## Current behavior

Run the code in `before` and inspect its output:

```bash
cd before/src/main/java
javac com/javapatterns/singleton/*.java
java com.javapatterns.singleton.Application
```

You should notice that configuration is loaded more than once and the services do not share the same object.

## Your task

Complete `after/src/main/java/com/javapatterns/singleton/ApplicationConfig.java` so that:

1. Only one `ApplicationConfig` instance can exist.
2. Other classes cannot create instances directly.
3. Every call requesting the configuration returns the same object.
4. The implementation is safe when accessed concurrently by multiple threads.
5. Existing configuration getters continue to work.
6. You do not change `Application`, `OrderService`, or `PaymentService`.

## Expected behavior

After your implementation, running `Application` from the `after` directory should:

- print `Loading application configuration...` exactly once;
- report that both services use the same configuration object;
- continue printing the application name and environment.

## Constraints

- Use only the Java standard library.
- Do not expose a public constructor.
- Do not store separate instances for separate callers.
- Keep the public API small and clear.

## Questions to answer

After solving the exercise, write down your answers:

1. Why must the constructor be inaccessible to callers?
2. What could go wrong if two threads initialize the instance simultaneously?
3. Is global access always desirable? What testing or coupling problems can it introduce?
4. When would dependency injection be a better choice than Singleton?

## Directory layout

```text
1.singleton/
├── README.md
├── before/   # Demonstrates the design problem
└── after/    # Your solution workspace
```

