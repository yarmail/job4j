package ru.job4j.anonimalishev;

public interface AnimalEat {
    public void eat();

    public static void main(String[] args) {
        AnimalEat animalEat = new AnimalEat() {
            @Override
            public void eat() {
                System.out.println("New animal eat");
            }
        };
        animalEat.eat();
    }
}