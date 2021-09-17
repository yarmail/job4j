package ru.job4j.peerview;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Check for errors
 * Проверить на наличие ошибок
 *
 * 1) Отсутствует java doc c пояснениями, зачем нужен этот
 * класс, какиие функции выполняет
 * 2) переменная treemap - тип понятен, непонятно,
 * какой смысл задает ей автор в контексте банка
 * как я понимаю, это список банковских счетов.
 * Возможно лучшим решением было бы listUserRequisites
 * 3) Судя по сообщениям IDEA (и сам вспомнил)
 * 4) возможно метод transfer нужно отрефакторить
 * сделать возможно короче, понятнее
 * через промежуточные расчеты
 * 5) не понятно с какой целью здесь находится метод toString
 * Было бы неплохо поставить аннотацию @Override для лучшего понимания
 * 
 *
 */
public class Bank {

    private TreeMap<User, ArrayList<Account>> treemap = new TreeMap<>();

    public void addUser(User user) {
        this.treemap.put(user, new ArrayList<>());
    }

    public void delete(User user) {
        this.treemap.remove(user);
    }

    public void add(User user, Account account) {
        this.treemap.get(user).add(account);
    }

    private Account getActualAccount(User user, Account account) {
        ArrayList<Account> list = this.treemap.get(user);
        return list.get(list.indexOf(account));
    }

    public void deleteAccount(User user, Account account) {
        this.treemap.get(user).remove(account);
    }

    public List<Account> getAccounts(User user) {
        return this.treemap.get(user);
    }

    public boolean transfer(User user1, Account account1,
                            User user2, Account account2, double amount) {
        return this.treemap.get(user1).contains(account1)
                && this.treemap.get(user2).contains(account2)
                && getActualAccount(user1, account1).transfer(
                getActualAccount(user2, account2), amount);
    }

    public String toString() {
        return "Bank{" + "accounts=" + treemap + "}";
    }
}
