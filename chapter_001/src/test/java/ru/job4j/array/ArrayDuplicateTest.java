package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] check = {"Привет", "Мир", "Супер"};
        ArrayDuplicate arrDup = new ArrayDuplicate();
        String[] result = arrDup.remove(input);
        // проверка массивов без сохранения порядка
        assertThat(result, arrayContainingInAnyOrder(check));
    }
}
