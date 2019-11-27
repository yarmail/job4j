package ru.job4j.bank;

/**
 * Bank account
 * Банковский счет
 *
 * Содержит поля:
 * sum - деньги
 * requisites - реквизиты счета
 */
public class Account {
    private double sum;
    private String requisites;

    public Account(double sum, String requisites) {
        this.sum = sum;
        this.requisites = requisites;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getRequisites() {
        return requisites;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

}

