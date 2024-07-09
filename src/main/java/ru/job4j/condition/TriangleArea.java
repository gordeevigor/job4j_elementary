package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        double result = TriangleArea.area(a, b, c);
        System.out.println("area (" + a + ", " + b + ", " + c + ") = " + result);
    }
}