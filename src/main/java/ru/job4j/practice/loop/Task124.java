package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task124 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int sum = 0;
            do {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            } while (temp > 0);
            joiner.add(String.valueOf(sum));
            newArray[i] = sum;
        }

        int max = newArray[0];
        int index = 0;
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] > max) {
                max = newArray[i];
                index = i;
            }
        }
        System.out.println("Суммы: " + joiner + ", индекс: " + index);
    }
}
