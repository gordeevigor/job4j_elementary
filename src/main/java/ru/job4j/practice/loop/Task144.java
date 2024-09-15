package ru.job4j.practice.loop;

public class Task144 {
    public static int remain(int num1, int num2) {
        int remain = Math.max(num1, num2) - Math.min(num1, num2);
        while (remain > Math.min(num1, num2)) {
            remain -= Math.min(num1, num2);
        }
            return remain;
    }

    public static void loop(int num1, int num2) {
        int minNumber = Math.min(num1, num2);
        int maxNumber = Math.max(num1, num2);
        int number = remain(minNumber, maxNumber);
        while (number > 0) {
            maxNumber = minNumber;
            minNumber = number;
            number = remain(minNumber, maxNumber);
        }
        System.out.println(minNumber);
    }
}
