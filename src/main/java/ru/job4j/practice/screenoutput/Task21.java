package ru.job4j.practice.screenoutput;

public class Task21 {
    public static void main(String[] args) {
        String fullName = "Фамилия Имя Отчество";
        String phoneNumber = "+7(938) 123-45-67";
        int nullStrings = fullName.length() - phoneNumber.length();
        for (int i = 0; i < fullName.length() + 4; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("* " + fullName + " *");
        System.out.println();
        System.out.print("* " + phoneNumber);
        for (int i = 0; i <= nullStrings; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        for (int i = 0; i < fullName.length() + 4; i++) {
            System.out.print("*");
        }
    }
}
