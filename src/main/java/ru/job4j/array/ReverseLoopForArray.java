package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Элементы массива в обратном порядке: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            int element = numbers[i];
            System.out.println(element);
        }
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Элементы массива в обратном порядке: ");
        for (int i = 0; i < numbers1.length; i++) {
            int element = numbers1[numbers1.length - i - 1];
            System.out.println(element);
        }
    }
}
