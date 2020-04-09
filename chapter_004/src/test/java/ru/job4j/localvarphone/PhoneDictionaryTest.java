package ru.job4j.localvarphone;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *  Использовать Local Variable Type Inference
 */
public class PhoneDictionaryTest {
    @Test
    public void find() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var persons = phones.find("nsk");
        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
    }
}