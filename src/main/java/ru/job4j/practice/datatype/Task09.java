package ru.job4j.practice.datatype;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        int div = a / b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(div);
    }
}
