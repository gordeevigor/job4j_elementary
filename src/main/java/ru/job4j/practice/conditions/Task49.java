package ru.job4j.practice.conditions;

public class Task49 {
    public static boolean check(String l, String r) {
        if (r.equals(l)) {
            return true;
        }
        return (l.charAt(0) == r.charAt(r.length() - 1)) && l.charAt(l.length() - 1) == r.charAt(0);
    }
}