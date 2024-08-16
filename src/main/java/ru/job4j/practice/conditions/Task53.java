package ru.job4j.practice.conditions;

public class Task53 {
    public static void transform(int number) {
        int num1, num2, num3;
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);

        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 10;

        if (number % 2 == 0) {
            num1 = num1 % 2 == 0 ? num1 + 1 : num1 - 1;
            num2 = num2 % 2 == 0 ? num2 + 1 : num2 - 1;
            num3 = num3 % 2 == 0 ? num3 + 1 : num3 - 1;
            System.out.println(sign * (num1 * 100 + num2 * 10 + num3));
        } else {
            num1 = (num1 % 2 == 0 && num1 > 0) ? num1 - 1 : (num1 % 2 != 0 && num1 < 9) ? num1 + 1 : num1;
            num2 = (num2 % 2 == 0 && num2 > 0) ? num2 - 1 : (num2 % 2 != 0 && num2 < 9) ? num2 + 1 : num2;
            num3 = (num3 % 2 == 0 && num3 > 0) ? num3 - 1 : (num3 % 2 != 0 && num3 < 9) ? num3 + 1 : num3;
            System.out.println(sign * (num1 * 100 + num2 * 10 + num3));
        }
    }
}
