package ru.job4j.practice.conditions;

public class ShortCircuitAnd {
    public static boolean showA() {
        System.out.println("A");
        return false;
    }

    public static boolean showB() {
        System.out.println("B");
        return false;
    }

    public static void main(String[] args) {
        if (showA() && showB()) {
            System.out.println("Hello");
        }
    }
}
