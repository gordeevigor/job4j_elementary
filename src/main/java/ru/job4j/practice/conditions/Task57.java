package ru.job4j.practice.conditions;

import java.util.StringJoiner;

public class Task57 {
    public static void triangleType(int a, int b) {
        if (a + b > 180) {
            System.out.println("Ошибка");
        } else {
            int c = 180 - a - b;

            StringJoiner joiner = new StringJoiner(" ");
            addIfNotEmpty(joiner, acuteTriangle(a, b, c));
            addIfNotEmpty(joiner, rightTriangle(a, b, c));
            addIfNotEmpty(joiner, obtuseTriangle(a, b, c));
            addIfNotEmpty(joiner, isoscelesTriangle(a, b, c));
            addIfNotEmpty(joiner, equalTriangle(a, b, c));
            System.out.println(joiner);
        }
    }

    private static void addIfNotEmpty(StringJoiner joiner, String triangleType) {
        if (!triangleType.isEmpty()) {
            joiner.add(triangleType);
        }
    }

    public static String acuteTriangle(int a, int b, int c) {
        return a < 90 && b < 90 && c < 90 ? "Остроугольный" : "";
        }

    public static String rightTriangle(int a, int b, int c) {
        return a == 90 || b == 90 || c == 90 ? "Прямоугольный" : "";
    }

    public static String obtuseTriangle(int a, int b, int c) {
        return a > 90 && c + b < 90 || b > 90 && a + c < 90 || c > 90 && a + b < 90 ? "Тупоугольный" : "";
    }

    public static String isoscelesTriangle(int a, int b, int c) {
        return a == b || a == c || b == c ? "Равнобедренный" : "";
    }

    public static String equalTriangle(int a, int b, int c) {
        return a == 60 && b == 60 ? "Равносторонний" : "";
    }
}

