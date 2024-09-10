package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task122 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int num : nums) {
            int temp = num;
            int sum = 0;
            do {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            } while (temp > 0);
            if (sum != 5) {
                joiner.add(String.valueOf(num));
            } else {
                break;
            }
        }
        System.out.println(joiner);
    }
}
