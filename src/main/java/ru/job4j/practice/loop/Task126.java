package ru.job4j.practice.loop;

public class Task126 {
    public static void loop(int num) {
        StringBuilder evenCount = new StringBuilder();
        StringBuilder oddCount = new StringBuilder();
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (count % 2 == 0) {
                evenCount.insert(0, digit + " ");
            } else {
                oddCount.insert(0, digit + " ");
            }
            count++;
            num /= 10; // Убираем последнюю цифру
        }
        if (count % 2 == 0) {
            System.out.println(evenCount.toString().trim());
            System.out.println(oddCount.toString().trim());
        } else {
            System.out.println(oddCount.toString().trim());
            System.out.println(evenCount.toString().trim());
        }
    }
}
