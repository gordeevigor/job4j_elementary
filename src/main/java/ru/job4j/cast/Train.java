package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " move by rails");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " sounds \"Chu-chu-chu!\"");
    }
}
