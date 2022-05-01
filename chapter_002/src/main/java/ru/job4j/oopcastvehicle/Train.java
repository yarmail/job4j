package ru.job4j.oopcastvehicle;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " Двигается по железной дороге");
    }
}
