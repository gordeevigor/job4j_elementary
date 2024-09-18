package ru.job4j.practice.loop;

public class Task150 {
    public static void loop(int overdraft, int account, int[] transfers) {
        int i = 0;
        while (account + transfers[i] >= overdraft && i < transfers.length - 1 && account + transfers[i] != account) {
                account += transfers[i];
                i++;
            }
        System.out.println("Остаток: " + account + ", операций: " + i);
    }
}
