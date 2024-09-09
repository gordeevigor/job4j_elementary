package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task121 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int sum = 0;
            do {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            } while (temp > 0);
            joiner.add(String.valueOf(sum));
        }
        System.out.println(joiner);
    }
}
