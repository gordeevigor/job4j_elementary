package ru.job4j.practice.datatype;


import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сантиметры для преобразования в дюймы:");
        int centimeters = input.nextInt();
        System.out.println("Полученный результат преобразования равен:");
        double inches = (double) centimeters / 2.54;
        System.out.printf("%.2f", inches);
    }
}