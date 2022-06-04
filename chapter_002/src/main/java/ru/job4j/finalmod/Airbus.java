package ru.job4j.finalmod;

/**
 * класс Airbus нельзя было наследовать
 */
public final class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        int countEngine = "A380".equals(this.name) ? 4 : COUNT_ENGINE;
        System.out.println("Количество двигателей равно: " + countEngine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
/*
Было
public class Airbus extends Aircraft

Стало
public final class Airbus extends Aircraft

Было
public void printCountEngine() {
COUNT_ENGINE = 4;
System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
}

Стало
public void printCountEngine() {
int countEngine = "A380".equals(this.name) ? 4 : COUNT_ENGINE;
System.out.println("Количество двигателей равно: " + countEngine);
}
}
 */
