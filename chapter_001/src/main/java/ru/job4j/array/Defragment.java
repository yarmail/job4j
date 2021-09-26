package ru.job4j.array;

/**
 * 6.8. Дефрагментация массива [#225 #4052]
 * В этом уроке необходимо написать код,
 * который будет перемещать заполненные ячейки массива в начало,
 * а пустые в конец.
 *
 * Когда мы создаем массив строк, то по умолчанию
 * все ячейки в нем заполняются по null-ссылке.
 * Про null-ссылку будет рассказано во второй части.
 * Пока воспринимайте null-ссылку как переменную с
 * пустым значением.
 *
 * Мы помним, что массивы в Java создаются с
 * фиксированной длиной. То есть добавить новую ячейку
 * или удалить старую ячейку нельзя. Можно только
 * заполнить ячейку или освободить ее.
 *
 * При работе с массивами будут возникать ситуации,
 * когда в массиве часть ячеек будет заполнена,
 * а часть - нет. Заполненные ячейки могут быть разбросаны
 * по всему массиву. Нам бы хотелось расположить
 * все эти ячейки в начале массива.
 */
public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}