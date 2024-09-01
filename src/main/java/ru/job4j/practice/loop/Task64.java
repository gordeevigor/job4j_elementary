package ru.job4j.practice.loop;

public class Task64 {
    public static void loop(int[] months) {
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;
        for (int month : months) {
            switch (month) {
                case 12, 1, 2:
                    winter++;
                    break;
                case 3, 4, 5:
                    spring++;
                    break;
                case 6, 7, 8:
                    summer++;
                    break;
                case 9, 10, 11:
                    fall++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Зимой: " + winter + ", Весной: " + spring + ", Летом: " + summer + ", Осенью: " + fall);
    }
}
