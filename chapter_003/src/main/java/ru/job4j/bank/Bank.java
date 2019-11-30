package ru.job4j.bank;

import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

/**
 * 1 вариант
 * The bank class performs various operations with user accounts
 * Класс банк выполняет различные операции со счетами пользователей
 */
public class Bank {
    private Map<User, List<Account>> map = new HashMap<>(0);

    /**
     * Exist User
     * Существует ли пользователь в списке
     */
    public boolean existUser(User user) {
        boolean result = false;
        if (!this.map.isEmpty() && this.map.containsKey(user)) {
            result = true;
        }
        return result;
    }
    /**
     * Add User
     * Добавляем нового пользователя, если его ещё нет
     * Так же можно использовать:
     * this.map.putIfAbsent(user, new ArrayList<Account>());
     */
    public boolean addUser(User user) {
        boolean result = false;
        if (!existUser(user)) {
            this.map.put(user, new ArrayList<Account>(0));
            result = true;
        }
        return result;
    }
    /**
     * Delete User
     * Удаляем пользователя, если он есть в списке
     */
    public boolean deleteUser(User user) {
        boolean result = false;
        if (existUser(user)) {
            this.map.remove(user);
            result = true;
        }
        return result;
    }
    /**
     * Exist Account (without checks)
     * Существует ли у такого пользователя такой счет?
     */
    public boolean existAccount(User user, Account account) {
        boolean result = false;
        List<Account> list = this.map.get(user);
            if (list.contains(account) && account != null) {
                result = true;
            }
        return result;
    }
    /**
     * Add Account
     * Добавить банковский счет, если его нет
     */
    public boolean addAccount(User user, Account account) {
        boolean result = false;
        if (existUser(user) && !existAccount(user, account)) {
            List<Account> list = this.map.get(user);
            list.add(account);
            result = true;
        }
        return result;
    }
    /**
     * Delete Account
     * Удалить банковский счет, если он есть
     */
    public boolean deleteAccount(User user, Account account) {
        boolean result = false;
        if (existUser(user) && existAccount(user, account)) {
            List<Account> list = this.map.get(user);
            list.remove(account);
            result = true;
        }
        return result;
    }
    /**
     * Exist Money (without checks)
     * Есть ли деньги на счете
     */
    public boolean existMoney(User user, Account account, double money) {
        boolean result = false;
        List<Account> list = this.map.get(user);
        int indexAccount = list.indexOf(account);
        double sum = list.get(indexAccount).getSum();
        if (sum >= money) {
            result = true;
        }
        return  result;
    }
    /**
     * Add money (without checks)
     * Добавить деньги на счет
     */
    public void addMoney(User user, Account account, double money) {
        List<Account> list = this.map.get(user);
        int indexAccount = list.indexOf(account);
        double sum = list.get(indexAccount).getSum();
        list.get(indexAccount).setSum(sum + money);
    }
    /**
     * Delete money (without checks)
     * Удалить деньги со счета
     */
    public void deleteMoney(User user, Account account, double money) {
        List<Account> list = this.map.get(user);
        int indexAccount = list.indexOf(account);
        double sum = list.get(indexAccount).getSum();
        list.get(indexAccount).setSum(sum - money);
    }
    /**
     * Transfer money (with checks)
     * Перевод средств
     */
    public boolean transfer(User scrUser, Account scrAccount,
                             User destUser, Account destAccount,
                             double money) {
        boolean result = false;
        boolean existUsers = existUser(scrUser) && existUser(destUser);
        boolean existAccounts = existAccount(scrUser, scrAccount)
                                && existAccount(destUser, destAccount);
        if (existUsers && existAccounts && existMoney(scrUser, scrAccount, money)) {
            deleteMoney(scrUser, scrAccount, money);
            addMoney(destUser, destAccount, money);
            result = true;
        }
        return result;
    }
}