package ru.job4j.practice.screenoutput;

public class Task16 {
    public static void main(String[] args) {
        String source = "+!?";
        for (int i = 0; i < 3; i++) {
            System.out.print(source.charAt(0));
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(source.charAt(1));
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(source.charAt(2));
        }
    }
}