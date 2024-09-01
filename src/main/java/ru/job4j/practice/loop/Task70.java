package ru.job4j.practice.loop;

public class Task70 {
    public static void loop(int a, int b, int r, int[] coords) {
        int onCircle = 0;
        int insideCircle = 0;

        // Квадрат радиуса для сравнения
        int rSquared = r * r;

        // Перебираем массив координат с шагом 2
        for (int i = 0; i < coords.length; i += 2) {
            int x = coords[i];
            int y = coords[i + 1];

            // Вычисляем квадрат расстояния от центра окружности до точки (x, y)
            int distanceSquared = (x - a) * (x - a) + (y - b) * (y - b);

            // Определяем положение точки относительно окружности
            if (distanceSquared == rSquared) {
                onCircle++;
            } else if (distanceSquared < rSquared) {
                insideCircle++;
            }
        }

        // Выводим результат
        System.out.println("На окружности: " + onCircle + ", внутри: " + insideCircle);
    }
}
