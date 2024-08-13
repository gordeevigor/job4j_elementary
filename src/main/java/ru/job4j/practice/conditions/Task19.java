package ru.job4j.practice.conditions;

public class Task19 {
    public static void sumOrMultiply(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + number2);
        } else if (number1 < number2) {
            System.out.println(number1 * number2);
        } else {
            System.out.println("Числа равны");
        }
    }
}
