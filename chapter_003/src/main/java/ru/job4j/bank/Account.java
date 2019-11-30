package ru.job4j.bank;

/**
 * Bank account
 * Банковский счет
 *
 * Содержит поля:
 * sum - деньги
 * requisite - реквизиты счета
 */
public class Account {
    private double sum;
    private String requisite;

    public Account(double sum, String requisite) {
        this.sum = sum;
        this.requisite = requisite;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

}

