package ru.job4j.practice.screenoutput;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double sum = a + b;
        double minus = a - b;
        double multiply = a * b;
        double divided = a / b;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divided);
    }
}
