package ru.job4j.practice.conditions;

public class Task55 {
    public static void apartmentPlace(int number) {
        int floor, position;
        floor = (number - 1) / 3 + 1;
        position = number % 3;
        System.out.println(floor);
        switch (position) {
            case 0:
                System.out.println(3);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
        }
    }
}
