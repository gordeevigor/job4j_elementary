package ru.job4j.oop;

public class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }

    public void giveMilk() {
        System.out.println(getClass().getSimpleName() + " дает человеку молоко.");
    }
}
