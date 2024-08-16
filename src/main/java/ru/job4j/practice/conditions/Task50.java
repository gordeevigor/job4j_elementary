package ru.job4j.practice.conditions;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int lastNum1 = num1 % 10;
        int lastNum2 = num2 % 10;
        if (lastNum1 != lastNum2) {
            System.out.println(Math.max(lastNum1, lastNum2));
        } else {
            System.out.println("Одинаковые");
        }
    }
}
