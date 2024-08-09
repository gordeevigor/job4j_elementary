package ru.job4j.practice.screenoutput;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        double p = Math.round(10 * 4 * a);
        double c = Math.round(10 * 2 * Math.PI * r);
        double s = Math.round(10 * Math.PI * Math.pow(r, 2));
        System.out.println(p / 10);
        System.out.println(c / 10);
        System.out.println(s / 10);
    }
}