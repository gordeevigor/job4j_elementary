package ru.job4j.practice.loop;

public class Task148 {
    public static void loop(int children, int adults, int[] cNum, int[] aNum) {
        int count = 0;
        int adult = adults;
        int child = children;
        for (int a = 0; a < aNum.length; a++) {
                if (adult >= 0
                        && child >= 0
                        && child >= cNum[a]
                        && adult >= aNum[a]) {
                    child -= cNum[a];
                    adult -= aNum[a];
                    count++;
                }
        }
        System.out.println("Группы: " + count + ", Взрослых: "
                + (adults - adult)
                        + ", детей: "
                + (children - child)
                + ", осталось билетов взр: "
                + adult + ", осталось билетов дет: " + child);
    }
}