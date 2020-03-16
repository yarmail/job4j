package ru.job4j.anonymclass;

import java.util.Comparator;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AttSortTest {

    Attachment att1 = new Attachment("image 3", 13);
    Attachment att2 = new Attachment("image 2", 34);
    Attachment att3 = new Attachment("image 1", 100);
    List<Attachment> attachments = Arrays.asList(att1, att2, att3);

    /**
     * Создаем объект для сравнения по полю Size типа int,
     * с использованием интерфейса Comparator и анонимного
     * класса
     */
    Comparator compareSize = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Attachment left = (Attachment) o1;
            Attachment right = (Attachment) o2;
            return left.getSize() - right.getSize();
        }
    };

    /**
     * Создаем объект для сравнения по полю Name типа String,
     * с использованием интерфейса Comparator и анонимного
     * класса
     */
    Comparator compareName = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Attachment left = (Attachment) o1;
            Attachment right = (Attachment) o2;
            return left.getName().compareTo(right.getName());
        }
    };

    /**
     * Проверяем как сработал компаратор на Размер
     */
    @Test
    public void compareSize() {
        this.attachments.sort(compareSize);
        Attachment result = attachments.get(0);
        Attachment expect = att1;
        assertThat(expect, is(result));
    }

    /**
     * Проверяем как сработал компаратор на Имя
     */
    @Test
    public void compareName() {
        this.attachments.sort(compareName);
        Attachment result = attachments.get(0);
        Attachment expect = att3;
        assertThat(expect, is(result));
    }


}