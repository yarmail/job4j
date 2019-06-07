package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Через эмулятор StubInput тестируем StartUI
 */
public class StartUITest {
    /**
     * Для рефакторинга переносим повторяющиеся переменные в поля класса
     */
    private final Tracker tracker = new Tracker();
    private final Item item = tracker.add(new Item("test name", "desc", 12345));

    /**
     * Показываем все заявки
     */
    @Test
    public void showAllTest() {
        Input input = new StubInput(new String[] {"1", "6"});
        new StartUI(input, tracker).init();
    }


    /**
     * addItemTest
     * Когда пользователь добавляет заявку,
     * тогда трекер имеет новую заявку с некоторым именем
     *
     * Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
     * Переопределяем input через StubInput
     * и задаем последовательность действий пользователя
     *
     * new StartUI(input, tracker).init();
     * создаём StartUI и вызываем метод init()
     *
     * assertThat(tracker.findAll()[0].getName(), is("test name"));
     * ИНТЕРЕСНО СФОРМУЛИРОВАНО
     * проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции
     */
    @Test
    public void addItemTest() {
        Input input = new StubInput(new String[] {"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }

    /**
     * editItemTest
     * Когда пользователь меняет заявку - она меняется в трекере
     *
     * Item item = tracker.add(new Item("test name", "desc", 12345));
     * ИНТЕРЕСНО СФОРМУЛИРОВАНО
     * напрямую добавляем заявку в массив трекера
     *
     * Input input = new StubInput(new String[] {"2", item.getId(), "new name", "new desc", "6"});
     * создаём StubInput с последовательностью действий (производим замену заявки)
     *
     * new StartUI(input, tracker).init();
     * создаём StartUI и вызываем метод init()
     *
     * tracker.findById(item.getId()).getName(),
     * ИНТЕРЕСНО СФОРМУЛИРОВАНО
     *
     */
    @Test
    public void editItemTest() {
        Input input = new StubInput(new String[] {"2", item.getId(), "new name", "new desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("new name"));
    }

    /**
     * Если пользователем удаляется элемент, то длина результирующего массива = 0
     */
    @Test
    public void deleteTest() {
        Input input = new StubInput(new String[] {"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        Item[] result = tracker.findByName("test name");
        assertThat((result.length), is(0));
    }
}