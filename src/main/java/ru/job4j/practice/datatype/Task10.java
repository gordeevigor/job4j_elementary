package ru.job4j.practice.datatype;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double celsius = (double) (5 * (fahrenheit - 32)) / 9;
        System.out.printf("%.1f", celsius);
    }
}