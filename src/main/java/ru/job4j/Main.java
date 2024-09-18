package ru.job4j;

import ru.job4j.practice.loop.*;

public class Main {
    public static void main(String[] args) {
        int[] transfers = {-500, -100, 0, 300};
        Task150.loop(-100, 500, transfers);
    }
}