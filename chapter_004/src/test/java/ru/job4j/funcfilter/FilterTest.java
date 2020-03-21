package ru.job4j.funcfilter;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * В данном тесте сравниваем два решения:
 * expect - это решение без встроенн. функ. интерфейсов
 * result - со встроенными интерфейсами
 */

public class FilterTest {

    Attachment att1 = new Attachment("bug", 13);
    Attachment att2 = new Attachment("image 2", 34);
    Attachment att3 = new Attachment("image 1", 100);
    Attachment att4 = new Attachment("image 0", 200);
    List<Attachment> attachments = Arrays.asList(att1, att2, att3, att4);

    @Test
    public void filterSize() {
        List<Attachment> expect = FilterOld.filterSize(attachments);
        List<Attachment> result = Filter.filterSize(attachments);
        assertThat(expect, is(result));
    }

    @Test
    public void filterName() {
        List<Attachment> expect = FilterOld.filterName(attachments);
        List<Attachment> result = Filter.filterName(attachments);
        assertThat(expect, is(result));
    }
}