package ru.job4j.polymorphism;

import javax.sound.midi.VoiceStatus;

public class Main {
    public static void main(String[] args) {
        Vehicle sportCar = new SportCar();
        sportCar.accelerate();
        sportCar.brake();
        sportCar.changeGear();
        sportCar.steer();
        sportCar.refill();
        Vehicle.getDragCoefficient();
        sportCar.chargeBattery();
    }
}
