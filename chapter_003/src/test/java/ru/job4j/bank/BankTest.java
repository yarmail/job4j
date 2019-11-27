package ru.job4j.bank;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;


public class BankTest {

    /**
     * В пустом списке existUser = false
     */
    @Test
    public void existUser() {
        User user1 = new User("user1", "12345");
        Bank bank = new Bank();
        boolean result = bank.existUser(user1);
        assertThat(result, is(false));
    }
    /**
     * При добавлении пользователя
     * addUser = true, existUser = true
     */
    @Test
    public void addUser() {
        User user1 = new User("user1", "12345");
        Bank bank = new Bank();
        boolean addUser = bank.addUser(user1);
        boolean existUser = bank.existUser(user1);
        boolean result = addUser && existUser;
        assertThat(result, is(true));
    }
    /**
     * После добавления пользователя
     * existUser = true
     * После удаления пользователя
     * deleteUser = true
     */
    @Test
    public void deleteUser() {
        User user1 = new User("user1", "12345");
        Bank bank = new Bank();
        bank.addUser(user1);
        boolean existUser = bank.existUser(user1);
        boolean deleteUser = bank.deleteUser(user1);
        boolean result = existUser && deleteUser;
        assertThat(result, is(true));
    }
    /**
     * Exist Account
     * В листе счетов у пользователя нет отсутствующего счета
     */
    @Test
    public void existAccount() {
        User user1 = new User("user1", "12345");
        Account account1 = new Account(100, "N001");
        Bank bank = new Bank();
        bank.addUser(user1);
        boolean result = bank.existAccount(user1, account1);
        assertThat(result, is(false));
    }
    /**
     * Add Account
     * После добавления банковского счета:
     * addAccount = true;
     * existAccount = true;
     */
    @Test
    public void addAccount() {
        User user1 = new User("user1", "12345");
        Account account1 = new Account(100, "N001");
        Bank bank = new Bank();
        bank.addUser(user1);
        boolean addAccount = bank.addAccount(user1, account1);
        boolean existAccount = bank.existAccount(user1, account1);
        boolean result = addAccount && existAccount;
        assertThat(result, is(true));
    }
    /**
     * Delete Account
     * После добавления банковского счета
     * existAccount = true;
     * При удалении банковского счета
     * deleteAccount = true;
     */
    @Test
    public void deleteAccount() {
        User user1 = new User("user1", "12345");
        Account account1 = new Account(100, "N001");
        Bank bank = new Bank();
        bank.addUser(user1);
        bank.addAccount(user1, account1);
        boolean existAccount = bank.existAccount(user1, account1);
        boolean deleteAccount = bank.deleteAccount(user1, account1);
        boolean result = existAccount && deleteAccount;
        assertThat(result, is(true));
    }
    /**
     * Add Money
     * Было 100, добавили 100 стало 200
     */
    @Test
    public void addMoney() {
        User user1 = new User("user1", "12345");
        Account account1 = new Account(100, "N001");
        Bank bank = new Bank();
        bank.addUser(user1);
        bank.addAccount(user1, account1);
        bank.addMoney(user1, account1, 100);
        double result = account1.getSum();
        assertThat(result, is(200.0));
    }
    /**
     * Delete Money
     * Было 100, отняли 50, стало 50
     */
    @Test
    public void deleteMoney() {
        User user1 = new User("user1", "12345");
        Account account1 = new Account(100, "N001");
        Bank bank = new Bank();
        bank.addUser(user1);
        bank.addAccount(user1, account1);
        bank.deleteMoney(user1, account1, 50);
        double result = account1.getSum();
        assertThat(result, is(50.0));
    }
    /**
     * Transfer money
     * Перевод средств
     * До перевода: 1 = 100, 2 = 100
     * После перевода: 1 = 50, 2 = 150
     */
    @Test public void transfer() {
        User user1 = new User("user1", "12345");
        User user2 = new User("user2", "54321");
        Account account1 = new Account(100, "N001");
        Account account2 = new Account(100, "N002");
        Bank bank = new Bank();
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccount(user1, account1);
        bank.addAccount(user2, account2);
        bank.transfer(user1, account1, user2, account2, 50);
        boolean result = account1.getSum() == 50.0 && account2.getSum() == 150.0;
        assertThat(result, is(true));
    }
}