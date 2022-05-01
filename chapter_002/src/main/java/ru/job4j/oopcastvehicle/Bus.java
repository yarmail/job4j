package ru.job4j.oopcastvehicle;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " Двигается по земле");
    }
}
