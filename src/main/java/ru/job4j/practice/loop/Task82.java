package ru.job4j.practice.loop;

public class Task82 {
    public static void loop(int[] promo, int[] concert) {
        int freeTickets = 0;
        int ticketsPromo = 0;
        int ticketsConcert = 0;
        for (int j : promo) {
            ticketsPromo += j;
            if (j / 10 > 0) {
                freeTickets += j / 10;
            }
        }
        for (int j : concert) {
            ticketsConcert += j;
        }
        int tickets = ticketsConcert + ticketsPromo;
        System.out.println("Продано билетов: " + tickets + ", выдано бесплатно: " + freeTickets);
    }
}
