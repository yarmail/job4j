package ru.job4j.streamaddress;

/**
 * Анкета клиента описывается моделью Profile
 * В профиле сохраняются адреса клиентов
 */
public class Profile {
    private Address address;

    Profile(Address address) {
        this.address = address;
    }

    Address getAddress() {
        return address;
    }
}

