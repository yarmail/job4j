package ru.job4j.funcexample;

import java.util.function.Function;

/**
 * Представьте, что от заказчика пришло новое требование – у нас должен существовать набор методов,
 * которые будут выполнять преобразования строк:
 * 1. Приводить все символы строки к верхнему
 * регистру;
 * 2. Производит конкатенацию двух строк;
 * 3. Удаляет из строки все пробелы в начале и конце строки.
 *  Вспомним, что для того, чтобы выполнить
 *  преобразования над данными прекрасно
 *  подходит функциональный интерфейс Function.
 *  В данном случае мы работаем со строками,
 *  и на выходе работы методов мы будем
 *  также получать строку – значит использовать
 *  будем интерфейс в таком виде –
 *  Function<String, String>:
 */
public class FuncTrans {
    public String transform(Function<String, String> function, String string) {
        return function.apply(string);
    }

    public static void main(String[] args) {
        FuncTrans funcTrans = new FuncTrans();
        System.out.println(
                "Строка после преобразования: " + funcTrans.transform(
                        str -> str.toUpperCase(), "aBCdEfghKLmnpRstU"
                )
        );
        System.out.println(
                funcTrans.transform(
                        str -> str.concat("работает корректно."), "Строка после преобразования: "
                )
        );
        System.out.println(
                "Строка после преобразования: " + funcTrans.transform(
                        str -> str.trim(), "    aBC dEfghK Lmnp RstU        "
                )
        );
    }
}