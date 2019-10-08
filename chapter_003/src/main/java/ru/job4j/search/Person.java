package ru.job4j.search;

/**
 * Person Information
 */

public class Person {

        private String name;
        private String surname;
        private String phone;
        private String adress;

        public Person (String name, String surname, String phone, String address) {
            this.name = name;
            this.surname = surname;
            this.phone = phone;
            this.adress = address;
        }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPhone() {
        return phone;
    }
    public String getAdress() {
        return adress;
    }
}
