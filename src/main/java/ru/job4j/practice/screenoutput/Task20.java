package ru.job4j.practice.screenoutput;

public class Task20 {
    public static void print(int x, int y) {
        System.out.println("Переменные: " + x + " " + y);
        System.out.println("Сумма: " + (x + y));
        System.out.println("Произведение: " + (x * y));
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        print(x, y);
    }
}
