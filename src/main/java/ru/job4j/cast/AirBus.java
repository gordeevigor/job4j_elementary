package ru.job4j.cast;

public class AirBus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " move by air");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " sounds like bird");
    }
}
