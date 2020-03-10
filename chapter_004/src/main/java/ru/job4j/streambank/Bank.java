package ru.job4j.streambank;

import java.util.*;

/**
 * The bank class performs various operations with user accounts
 * Класс банк выполняет различные операции со счетами пользователей
 */

public class Bank {
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

    /**
     * Поиск пользователя по номеру паспорта
     * Решение через Stream
     *
     */
    public User getUserByPassport(String passport) {
        return this.map.keySet().stream()
                .filter(i -> i.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public List<Account> getUserAccounts(String passport) {
        List<Account> result = Collections.emptyList();
        if (getUserByPassport(passport) != null) {
            result = this.map.get(getUserByPassport(passport));
        }
        return result;
    }

    public void addAccountToUser(String passport, Account account) {
        getUserAccounts(passport).add(account);
    }

    public void deleteAccountFromUser(String passport, Account account) {
        getUserAccounts(passport).remove(account);
    }

    public Account getAccount(String passport, String requisite) {
        List<Account> accountList = getUserAccounts(passport);
        Account result = null;
        if (!accountList.isEmpty()) {
            result = accountList.stream()
                    .filter(i -> i.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                              String destPassport, String destRequisite,
                              double amount) {
        boolean result = false;

        Account srcAccount = getAccount(srcPassport, srcRequisite);
        Account destAccount = getAccount(destPassport, destRequisite);

        double srcSum = -1;
        double destSum = -1;
        if (srcAccount != null && destAccount != null) {
            srcSum = srcAccount.getSum();
            destSum = destAccount.getSum();
        }

        if (srcSum >= amount && srcSum != -1 && destSum != -1) {
            srcAccount.setSum(srcSum - amount);
            destAccount.setSum(destSum + amount);
            result = true;
        }
        return result;
    }
}
