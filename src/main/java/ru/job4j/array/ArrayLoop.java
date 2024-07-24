package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] y = new int[5];
        for (int i = 0; i < y.length; i++) {
            y[i] = i * 2 + 3;
        }
        for (int j : y) {
            System.out.println(j);
        }
    }
}
