package ru.job4j.practice.datatype;

public class Task19 {
    public static void sumAndConvert(double money, double gift, double ratio) {
        double euro = (money + gift) * ratio;
        System.out.printf("%.2f", euro);
    }
}
