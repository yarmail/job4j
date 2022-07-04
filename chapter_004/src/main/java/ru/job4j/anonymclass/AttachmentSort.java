package ru.job4j.anonymclass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 1.1. Анонимные классы [#214142]
 * 1. Создайте анонимный класс на основе интерфейса
 * Comparator для модели Attachment.
 * Класс должен сравнивать имена объектов Attachment.
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator comparator =  new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return Integer.compare(left.getSize(), right.getSize());
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator<Attachment> comparator2 = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
            }
        };
        attachments.sort(comparator2);
        System.out.println(attachments);
    }
}