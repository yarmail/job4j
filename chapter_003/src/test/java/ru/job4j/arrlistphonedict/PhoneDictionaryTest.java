package ru.job4j.arrlistphonedict;

import java.util.ArrayList;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {
    @Test
    public void find() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("nsk");
        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
    }
}