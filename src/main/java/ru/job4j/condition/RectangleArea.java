package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double result = l * h;
        return result;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        double result = RectangleArea.square(p, k);
        System.out.println(" p = " + p + ", k = " + k + ", square = " + result);
    }
}
