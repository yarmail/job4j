package ru.job4j.hashsetacc;

import java.util.HashSet;
import java.util.List;

/**
 * NotifyAccount - оповещение, рассылка
 * Чтобы система не спамила нашего клиента, там нужно
 * оставить только уникальных клиентов для отправки.
 *
 * есть тесты
 */
public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account: accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}