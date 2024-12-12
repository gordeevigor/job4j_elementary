package ru.job4j.oop;

public class HierarchyUsage {
    Car car = new Car();
    Transport transport = car;
    Object object = car;
    Object objectCar = new Car();

    Car carFromObject = (Car) objectCar;

    Object bicycle = new Bicycle();
    Bicycle carBicycle = (Bicycle) bicycle;
}
