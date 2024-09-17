package ru.job4j.practice.loop;

public class TaskVariant146 {
    public static void loop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (nums.length > 4 && sum > 300) {
            System.out.println("Людей: " + (nums.length - 1) + ", вес: "
                    + preOverweightWeight(nums) + ", отказ: Много людей и перегруз");
        } else if (sum > 300) {
            System.out.println("Людей: " + preOverweightPeople(nums) + ", вес: "
                    + preOverweightWeight(nums) + ", отказ: Перегруз");
        } else if (nums.length > 4) {
            System.out.println("Людей: " + (nums.length - 1) + ", вес: "
                    + preOvercrowdWeight(nums) + ", отказ: Много людей");
        } else {
            System.out.println("Людей: " + nums.length + ", вес: "
                    + sum + ", отказ: Нет");
        }
    }

    public static int preOverweightWeight(int[] nums) {
        int i = 0;
        int sum = 0;
        while (nums[i] <= 300 && i < nums.length - 1) {
            sum += nums[i];
            i++;
        }
        return sum;
    }

    public static int preOverweightPeople(int[] nums) {
        int i = 0;
        int sum = 0;
        while (nums[i] <= 300 && i < nums.length - 1) {
            sum += nums[i];
            i++;
        }
        return i;
    }

    public static int preOvercrowdWeight(int[] nums) {
        int i = 0;
        int sum = 0;
        while (i <= 4 && i < nums.length - 1) {
            sum += nums[i];
            i++;
        }
        return sum;
    }
}