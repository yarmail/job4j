package ru.job4j.oopcastvehicle;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " Двигается по воздуху");
    }
}
