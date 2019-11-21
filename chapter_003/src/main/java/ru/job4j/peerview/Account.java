package ru.job4j.peerview;

/**
 * Check for errors
 * Проверить на наличие ошибок
 *
 * 1) Отсутствует java doc c пояснениями, зачем нужен этот
 * класс, какиие функции выполняет
 * 2) Отсутсвует понятное название или описание
 * переменных, зачем они нужны и какую функцию выполняют
 * values, amount - может означать, что угодно
 * возможно - это про деньги
 * 3) Не совсем понятно, зачем нужны и зачем используются методы
 * toString, equals, hashCode. Также у этих методов желательно
 * было бы поставить аннотацию @Override для лучшего понимания
 * 4) Андрей мне говорил, что лучше использовать одиночный амперсанд &
 * а не двойной - это для метода transfer.
 * 5) -=, += — не очень распространены на курсе, не очень удобно читать
 *
 *
 */
public class Account {

    double values;
    String reqs;

    public Account(double values, String requisites) {
        this.values = values;
        this.reqs = requisites;
    }

    public double getValues() {
        return this.values;
    }

    public String getReqs() {
        return this.reqs;
    }

    /**
     * Возможно речь идет о разрешении на перевод средств
     * с указанного параметра
     * @param destination
     * @param amount
     * @return
     */
    boolean transfer(Account destination, double amount) {
        boolean success = false;
        if (amount > 0 && amount < this.values && destination != null) {
            success = true;
            this.values -= amount;
            destination.values += amount;
        }
        return success;
    }

    public String toString() {
        String otvet;
        otvet = "Account{" + "values=" + values + ", reqs='" + reqs + "\\" + "}";
        return otvet;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account account = (Account) o;

        return this.reqs.equals(account.reqs);
    }

    public int hashCode() {
        return this.reqs.hashCode();
    }
}
