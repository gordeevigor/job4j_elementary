package ru.job4j.practice.datatype;

public class Task18 {
    public static int capSum(int tens, int hundreds, int thousands) {
        int sum = 10 * tens + 100 * hundreds + 1000 * thousands;
        return sum;
    }
}