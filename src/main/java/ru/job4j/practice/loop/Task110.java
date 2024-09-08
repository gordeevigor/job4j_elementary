package ru.job4j.practice.loop;

public class Task110 {
    public static void loop(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] >= 150) {
                break;
            } else {
                sum += nums[i];
                count++;
            }
        }
        System.out.println("Сумма: " + sum + ", количество: " + count);
    }
}
