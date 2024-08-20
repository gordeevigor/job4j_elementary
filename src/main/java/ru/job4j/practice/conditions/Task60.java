package ru.job4j.practice.conditions;

public class Task60 {
    public static void numRelation(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Все равны");
        } else if (a != b && b != c && a != c) {
            System.out.println("Равных нет");
        } else if (a == b && c > b) {
            System.out.println("Первое и второе равны, третье больше");
        } else if (a == c && b > c) {
            System.out.println("Первое и третье равны, второе больше");
        } else if (b == c && a > b) {
            System.out.println("Второе и третье равны, первое больше");
        } else if (a == b && c < b) {
            System.out.println("Первое и второе равны, третье меньше");
        } else if (a == c && b < a) {
            System.out.println("Первое и третье равны, второе меньше");
        } else if (b == c && a < b) {
            System.out.println("Второе и третье равны, первое меньше");
        }
    }
}
