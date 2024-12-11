package ru.job4j.polymorphism;

public interface FunctionOne {
    default double function(double x, double y) {
        return x * x - 2 * y + 30;
    }

    default void functionMessage() {
        System.out.println("Сообщение из FunctionOne");
    }
}
