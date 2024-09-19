package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task152 {
    public static void loop() {
        StringJoiner joinerDivByTwo = new StringJoiner(" ");
        StringJoiner joinerDivByThree = new StringJoiner(" ");
        StringJoiner joinerDivByFour = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0) {
                joinerDivByTwo.add(String.valueOf(i));
            }
            if (i % 3 == 0) {
                joinerDivByThree.add(String.valueOf(i));
            }
            if (i % 4 == 0) {
                joinerDivByFour.add(String.valueOf(i));
            }
        }
        System.out.println(joinerDivByTwo);
        System.out.println(joinerDivByThree);
        System.out.println(joinerDivByFour);
    }
}
