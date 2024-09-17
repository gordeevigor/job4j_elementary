package ru.job4j.practice.loop;

public class Task148 {
    public static void loop(int children, int adults, int[] cNum, int[] aNum) {
        int count = 0;
        int adultTicketsRemain = adults;
        int childrenTicketsRemain = children;
        for (int a = 0; a < aNum.length; a++) {
                if (adultTicketsRemain >= 0
                        && childrenTicketsRemain >= 0
                        && childrenTicketsRemain >= cNum[a]
                        && adultTicketsRemain >= aNum[a]) {
                    childrenTicketsRemain -= cNum[a];
                    adultTicketsRemain -= aNum[a];
                    count++;
                }
        }
        System.out.println("Группы: " + count + ", Взрослых: "
                + (adults - adultTicketsRemain)
                        + ", детей: "
                + (children - childrenTicketsRemain)
                + ", осталось билетов взр: "
                + adultTicketsRemain + ", осталось билетов дет: " + childrenTicketsRemain);
    }
}