package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " move by roads");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " sounds \"Wrum-wrum-wrum!\"");
    }
}
