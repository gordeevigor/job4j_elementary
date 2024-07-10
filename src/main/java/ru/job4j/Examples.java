package ru.job4j;

public class Examples {
    public static void main(String[] args) {
        short s = 31000;
        char c = (char) s;
        long d = (long) c;
        System.out.println("Вывод в консоль значения после преобразования: " + c);
        System.out.println("Вывод в консоль значения после преобразования: " + d);
    }
}
