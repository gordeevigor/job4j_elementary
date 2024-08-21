package ru.job4j.practice.conditions;

public class Task66 {
    public static void daytime(int number) {
        switch (number) {
            case 6, 7, 8, 9, 10:
                System.out.println("Утро");
                break;
            case 11, 12, 13, 14, 15, 16, 17:
                System.out.println("День");
                break;
            case 18, 19, 20, 21, 22:
                System.out.println("Вечер");
                break;
            case 0, 1, 2, 3, 4, 5, 23:
                System.out.println("Ночь");
                break;
            default:
                System.out.println("Не является часом");
                break;
        }
    }
}
