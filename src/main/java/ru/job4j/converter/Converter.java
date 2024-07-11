package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inputRubles = 140;
        float expectedEuro = 2;
        float outputEuro = Converter.rubleToEuro(inputRubles);
        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("Результат конвертации " + inputRubles + " руб. в Euro равен: " + outputEuro);
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        inputRubles = 180;
        float expectedDollar = 3;
        float outputDollar = Converter.rubleToDollar(inputRubles);
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("Результат конвертации " + inputRubles + " руб. в Dollar равен: " + outputDollar);
        System.out.println("180 rubles are 3. Test result : " + passedDollar);
    }
}
