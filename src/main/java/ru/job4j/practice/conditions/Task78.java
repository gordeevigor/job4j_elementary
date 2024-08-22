package ru.job4j.practice.conditions;

public class Task78 {
    public static void divWithoutRemainder(int num) {
        int num1 = num / 100;
        int num2 = (num % 100) / 10;
        int num3 = num % 10;
        boolean hasDivisors = false;
        boolean needSpace = false;
        if (num1 != 0 && num % num1 == 0) {
            System.out.print(num1);
            hasDivisors = true;
            needSpace = true;
        }
        if (num2 != 0 && num % num2 == 0) {
            if (needSpace) {
                System.out.print(" ");
            }
            System.out.print(num2);
            hasDivisors = true;
            needSpace = true;
        }
        if (num3 != 0 && num % num3 == 0) {
            if (needSpace) {
                System.out.print(" ");
            }
            System.out.print(num3);
            hasDivisors = true;
        }
        if (!hasDivisors) {
            System.out.println("Таких чисел нет");
        } else {
            System.out.println();
        }
    }
}
