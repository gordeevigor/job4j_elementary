package ru.job4j.practice.datatype;

public class Task23 {
    public static void separate(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = (number % 10) % 10;
        System.out.println(num3 + " " + num2 + " " + num1);
    }
}
