package ru.job4j.streambank;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BankTest {

    User user1 = new User("user1", "12345");
    User user2 = new User("user2", "54321");
    Account account1 = new Account(100, "N001");
    Account account2 = new Account(200, "N002");

    @Test
    public void addUser() {
        Bank bank = new Bank();
        bank.addUser(user1);
        User user = bank.getUserByPassport("12345");
        assertThat(user, is(user1));
    }
    @Test
    public void deleteUser() {
        Bank bank = new Bank();
        bank.addUser(user1);
        bank.addUser(user2);
        bank.deleteUser(user1);
        boolean result = bank.existUser(user1);
        assertThat(result, is(false));
    }
    @Test
    public void getUserByPassport() {
        Bank bank = new Bank();
        bank.addUser(user1);
        User user = bank.getUserByPassport("12345");
        assertThat(user, is(user1));
    }
    @Test
    public void getUserAccounts() {
        Bank bank = new Bank();
        bank.addUser(user1);
        bank.addAccountToUser("12345", account1);
        bank.addAccountToUser("12345", account2);
        int result = bank.getUserAccounts("12345").size();
        assertThat(result, is(2));
    }
    @Test
    public void addAccountToUser() {
        Bank bank = new Bank();
        bank.addUser(user1);
        bank.addAccountToUser("12345", account1);
        bank.addAccountToUser("12345", account2);
        int result = bank.getUserAccounts("12345").size();
        assertThat(result, is(2));
    }
    @Test
    public void deleteAccountFromUser() {
        Bank bank = new Bank();
        bank.addUser(user1);
        bank.addAccountToUser("12345", account1);
        bank.addAccountToUser("12345", account2);
        bank.deleteAccountFromUser("12345", account1);
        int result = bank.getUserAccounts("12345").size();
        assertThat(result, is(1));
    }
    @Test
    public void transferMoney() {
        Bank bank = new Bank();
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