package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        short womanHeight = 170;
        System.out.println("Man " + manHeight + " is " + manWeight(manHeight));
        System.out.println("Woman " + womanHeight + " is " + womanWeight(womanHeight));
        }
    }
