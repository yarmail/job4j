package ru.job4j.bank;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class Bank2Test {

    User user1 = new User("user1", "12345");
    User user2 = new User("user2", "54321");
    Account account1 = new Account(100, "N001");
    Account account2 = new Account(200, "N002");

    @Test
    public void addUser() {
        Bank2 bank = new Bank2();
        bank.addUser(user1);
        User user = bank.getUserByPassport("12345");
        assertThat(user, is(user1));
    }
    @Test
    public void deleteUser() {
        Bank2 bank = new Bank2();
        bank.addUser(user1);
        bank.addUser(user2);
        bank.deleteUser(user1);
        boolean result = bank.existUser(user1);
        assertThat(result, is(false));
    }
    @Test
    public void getUserByPassport() {
        Bank2 bank = new Bank2();
        bank.addUser(user1);
        User user = bank.getUserByPassport("12345");
        assertThat(user, is(user1));
    }
    @Test
    public void getUserAccounts() {
        Bank2 bank = new Bank2();
        bank.addUser(user1);
        bank.addAccountToUser("12345", account1);
        bank.addAccountToUser("12345", account2);
        int result = bank.getUserAccounts("12345").size();
        assertThat(result, is(2));
    }
    @Test
    public void addAccountToUser() {
        Bank2 bank = new Bank2();
        bank.addUser(user1);
        bank.addAccountToUser("12345", account1);
        bank.addAccountToUser("12345", account2);
        int result = bank.getUserAccounts("12345").size();
        assertThat(result, is(2));
    }
    @Test
    public void deleteAccountFromUser() {
        Bank2 bank = new Bank2();
        bank.addUser(user1);
        bank.addAccountToUser("12345", account1);
        bank.addAccountToUser("12345", account2);
        bank.deleteAccountFromUser("12345", account1);
        int result = bank.getUserAccounts("12345").size();
        assertThat(result, is(1));
    }
    @Test
    public void getIndexAccount() {
        Bank2 bank = new Bank2();
        bank.addUser(user1);
        bank.addAccountToUser("12345", account1);
        bank.addAccountToUser("12345", account2);
        int result = bank.getIndexAccount("12345", "N001");
        assertThat(result, is(0));
    }
    @Test
    public void getAccountMoney() {
        Bank2 bank = new Bank2();
        bank.addUser(user1);
        bank.addAccountToUser("12345", account1);
        double result = bank.getAccountMoney("12345", "N001");
        assertThat(result, is(100.0));
    }
    @Test
    public void setAccountMoney() {
        Bank2 bank = new Bank2();
        bank.addUser(user1);
        bank.addAccountToUser("12345", account1);
        bank.setAccountMoney("12345", "N001", 100.0);
        double result = bank.getAccountMoney("12345", "N001");
        assertThat(result, is(200.0));
    }
    @Test
    public void transferMoney() {
        Bank2 bank = new Bank2();
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccountToUser("12345", account1);
        bank.addAccountToUser("54321", account2);
        boolean result = bank.transferMoney("12345", "N001",
                                            "54321", "N002",
                                            50);
        assertThat(result, is(true));
    }
}