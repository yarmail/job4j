package ru.job4j.oopcastvehicle;

/**
 * 3.2. Зачем нужно приведение типов [#310019]
 *
 * ... В чем же практическая польза?. А в том, что мы можем все,
 * что мы писали в этом задании переписать на интерфейс Animal,
 * в который мы вынесем метод, который будет доступен всем животным,
 * однако для каждого он будет иметь собственную реализацию.
 *
 * --------------------------------------
 * Задание
 * 1. Добавьте интерфейс Транспортное средство (Vehicle),
 * определите в нем метод без возвращаемого типа move().
 * По желанию можете добавить еще один метод, который
 * будет характеризовать любое транспортное
 * средство с учетом п. 2 задания
 *
 * 2. Добавьте три реализации - Самолет, Поезд, Автобус.
 * В каждом реализуйте метод move() - каждый по своему,
 * поскольку самолет летает по воздуху,
 * поезд передвигается по рельсам, а автобус двигается
 * по скоростным трассам;
 *
 * 3. Создайте несколько объектов каждого класса,
 * при этом приведите их к типу Vehicle.
 * Сложите все объекты в массив, а потом в цикле for()
 * выведите все объекты в консоль с вызовом их методов;
 *
 */
public class Run {
    public static void main(String[] args) {
        Vehicle bigBus = new Bus();
        Vehicle normalBus = new Bus();
        Vehicle smallBus = new Bus();
        Vehicle bigPlane = new Plane();
        Vehicle normaPlane = new Plane();
        Vehicle smallPlane = new Plane();
        Vehicle bigTrain = new Train();
        Vehicle normalTrain = new Train();
        Vehicle smallTrain = new Train();

        Vehicle[] vehicles = new Vehicle[] {
                bigBus, normalBus, smallBus,
                bigPlane, normaPlane, smallPlane,
                bigTrain, normalTrain, smallTrain
                };
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}