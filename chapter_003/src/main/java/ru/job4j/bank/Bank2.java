package ru.job4j.bank;

import java.util.*;

/**
 * 2 вариант
 * The bank class performs various operations with user accounts
 * Класс банк выполняет различные операции со счетами пользователей
 */

public class Bank2 {
    private Map<User, List<Account>> map = new HashMap<>();

    public boolean existUser(User user) {
        boolean result = false;
        if (!this.map.isEmpty() && this.map.containsKey(user)) {
            result = true;
        }
        return result;
    }

        public void addUser(User user) {
        this.map.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(User user) {
        this.map.remove(user);
    }

    public User getUserByPassport(String passport) {
        User result = null;
        Set<User> users = this.map.keySet();
        for (User i : users) {
            if (i.getPassport().equals(passport)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public List<Account> getUserAccounts(String passport) {
        return this.map.get(getUserByPassport(passport));
    }

    public void addAccountToUser(String passport, Account account) {
        getUserAccounts(passport).add(account);
    }

    public void deleteAccountFromUser(String passport, Account account) {
        getUserAccounts(passport).remove(account);
    }

    public int getIndexAccount(String passport, String requisite) {
        List<Account> accountList = getUserAccounts(passport);
        int result = -1;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getRequisite().equals(requisite)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public double getAccountMoney(String passport, String requisite) {
        List<Account> accountList = getUserAccounts(passport);
        int indexAccount = getIndexAccount(passport, requisite);
        return accountList.get(indexAccount).getSum();
    }

    public void setAccountMoney(String passport, String requisite, double amount) {
        double sum = getAccountMoney(passport, requisite);
        List<Account> accountList = getUserAccounts(passport);
        int indexAccount = getIndexAccount(passport, requisite);
        accountList.get(indexAccount).setSum(sum + amount);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                              String destPassport, String destRequisite,
                              double amount) {
        boolean result = false;
        int existScrAccount = getIndexAccount(srcPassport, srcRequisite);
        int existDestAccount = getIndexAccount(destPassport, destRequisite);
        double sum = getAccountMoney(srcPassport, srcRequisite);
        if (sum >= amount && existScrAccount > -1 && existDestAccount > -1) {
            setAccountMoney(destPassport, destRequisite, amount);
            result = true;
        }
        return result;
    }
}