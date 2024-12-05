package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder string = new StringBuilder("Job4J");
        for (int i = 0; i < 9999; i++) {
            string.append(i);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}
