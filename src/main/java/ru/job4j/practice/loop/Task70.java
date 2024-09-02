package ru.job4j.practice.loop;

public class Task70 {
    public static void loop(int a, int b, int r, int[] coords) {
        int onCircle = 0;
        int insideCircle = 0;
        int onCircleCoordinates = r * r;
        for (int i = 0; i < coords.length; i = i + 2) {
            int x = coords[i];
            int y = coords[i + 1];
            int distanceCoordinates = (x - a) * (x - a) + (y - b) * (y - b);

            if (distanceCoordinates == onCircleCoordinates) {
                onCircle++;
            }
            if (distanceCoordinates < onCircleCoordinates) {
                insideCircle++;
            }
        }
        System.out.println("На окружности: " + onCircle + ", внутри: " + insideCircle);
    }
}
