package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    /**
     * Примечание
     * проверка массивов без сохранения порядка
     * assertThat(result, arrayContainingInAnyOrder(check));
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] check = {"Привет", "Мир", "Супер"};
        ArrayDuplicate arrDup = new ArrayDuplicate();
        String[] result = arrDup.remove(input);
        assertThat(result, arrayContainingInAnyOrder(check));
    }
}