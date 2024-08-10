package ru.job4j.practice.datatype;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inches = input.nextInt();
        double centimeters = 2.54 * inches;
        System.out.printf("%.2f", centimeters);
    }
}
