package ru.job4j.hashmappass;

import java.util.HashMap;
import java.util.Map;

/**
 * Есть тесты
 */
public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean result = false;
        if ( !check(citizen.getPassport()) ) {
            citizens.put(citizen.getPassport(), citizen);
            result = true;
        }
        return result;
    }

    public Citizen get(String passport) {
        Citizen citizen = null;
        if (check(passport)) {
            citizen = citizens.get(passport);
        }
        return citizen;
    }

    /**
     * Проверка существования ключа в мапе
     */
    public boolean check(String passport) {
        boolean result = false;
        if (citizens.containsKey(passport)) {
            result = true;
        }
        return result;
    }
}