package ru.job4j.practice.conditions;

public class Task64 {
    public static void gradePrint(int number) {
        switch (number) {
            case 1, 2:
                System.out.println("Плохо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Не соответствует");
                break;
        }
    }
}
