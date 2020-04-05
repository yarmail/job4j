package ru.job4j.streamaddress;

import java.util.Comparator;

public class SortByCityAddress implements Comparator<Address> {
    @Override
    public int compare(Address first, Address second) {
        return first.getCity().compareTo(second.getCity());
    }
}