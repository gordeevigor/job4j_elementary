package ru.job4j.practice.loop;

public class Task146 {
    public static void loop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Людей: " + nums.length + ", вес: " + sum + ", отказ: " + reject(nums.length, sum));
    }

    public static String reject(int people, int weight) {
        String result;
        if (people > 4 && weight > 300) {
            result = "Много людей и перегруз";
        } else if (weight > 300) {
            result = "Перегруз";
        } else if (people > 4) {
            result = "Много людей";
        } else {
            result = "Нет";
        }
        return result;
    }
}
