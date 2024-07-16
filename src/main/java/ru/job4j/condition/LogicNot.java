package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        boolean result = false;
        if (num != 0) {
        result = !isPositive(num);
        }
        return result;
    }

    public static boolean notEvenAndPositive(int num) {
        boolean result = false;
        if (num != 0) {
            result = notEven(num) && isPositive(num);
        }
        return result;
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }
}