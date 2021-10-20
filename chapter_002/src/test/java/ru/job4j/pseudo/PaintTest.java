package ru.job4j.pseudo;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * В Java есть класс, который отвечает за управления выводом информации.
 * По умолчанию весь вывод настроен на консоль.
 * Мы можем заменить класс для вывода в консоль и заменить ее выводом в память.
 *
 * PrintStream stdout = System.out;
 * получаем ссылку на стандартный вывод в консоль.
 *
 * Для загрузки нового объекта для управлении выводом нам нужно
 * использовать метод System.setOut
 *
 * Этот метод принимает объект типа PrintStream.
 * У этого класса есть конструктор, который принимает объект типа OutputStream.
 * Этот поток нам и надо заменить на свой.
 *
 * У класса OutputStream есть реализации ByteArrayOutputStream.
 * Этот массив байт, который мы можем проверить в нашем тесте.
 *
 * ByteArrayOutputStream out = new ByteArrayOutputStream();
 * Создаем буфур для хранения вывода.
 *
 * System.setOut(new PrintStream(out));
 * Заменяем стандартный вывод на вывод в пямять для тестирования.
 *
 * new Paint().draw(new Square());
 * выполняем действия пишушиее в консоль.
 *
 * System.setOut(stdout);
 * возвращаем обратно стандартный вывод в консоль.
 */
public class PaintTest {
    /**
     * Как мы видим наш код имеет повторяющиеся куски кода.
     * Эти куски кода устанавливают начальное значения и убирают их в конце.
     * выносим из тестов в поля
     */
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Эти куски кода устанавливают начальное значения и убирают их в конце.
     * Давайте мы вынесем эти куски в отдельные методы.
     * System.out.println("execute before method"); -  в тестировании
     * будет  прописываться использование этой аннотации
     */
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void drawSquare() {
    new Paint().draw(new Square());
        assertThat(this.out.toString(), is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("++++")
                .add("++++")
                .add("++++")
                .add("++++")
                .toString()
        ));
    }

    @Test
    public void drawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(this.out.toString(), is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("+")
                .add("++")
                .add("+++")
                .add("++++")
                .toString()
        ));
    }
}