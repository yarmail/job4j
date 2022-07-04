package ru.job4j.anonimalishev;

public class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

    /* создаем объект Animal
    с помощью анонимного класса,
    с переопредлением метода eat()
     */
        Animal animal2 = new Animal() {
            @Override
            public void eat() {
                System.out.println("animal2 eat");
            }

        };
        animal2.eat();
    }
}