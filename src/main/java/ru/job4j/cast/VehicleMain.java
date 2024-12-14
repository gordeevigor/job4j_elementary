package ru.job4j.cast;

public class VehicleMain {
    public static void main(String[] args) {
        AirBus airBus = new AirBus();
        Train train = new Train();
        Bus bus = new Bus();
        Vehicle[] vehicles = {airBus, train, bus};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.sound();
        }
    }
}
