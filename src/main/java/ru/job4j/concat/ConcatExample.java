package ru.job4j.concat;

import java.util.StringJoiner;

public class ConcatExample {
    public static void main(String[] args) {
        String string = "abc".concat("efg").concat("hjk");
        System.out.println(string);
        string = String.join(" ", "abc", "def", "ghj");
        System.out.println(string);
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        stringJoiner.add("abc").add("def").add("ghi");
        System.out.println(stringJoiner);
        String joined = stringJoiner.toString();
        System.out.println(joined);
    }
}
