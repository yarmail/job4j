package ru.job4j.streamaddress;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    /**
     * Уникальные и сортированные по городу адреса
     */
    List<Address> collectUnique(List<Address> addresses) {
        return addresses.stream()
                .sorted(new SortByCityAddress())
                .distinct()
                .collect(Collectors.toList());
    }
}