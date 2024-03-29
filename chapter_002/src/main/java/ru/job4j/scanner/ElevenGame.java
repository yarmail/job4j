package ru.job4j.scanner;

import java.util.Scanner;

/**
 * 2. Scanner и чтение числа из консоли. [#179518]
 *
 * Задание
 * В этом задании вам необходимо сделать игру 11.
 * Смысл игры в следующем. На столе лежат 11 спичек.
 * Два игрока по очереди берут от 1 до 3 спичек.
 * Выигрывает тот, кто забрал последние спички.
 *
 * В предыдущем уроке мы познакомились с методом
 * nextLine() класса Scanner.
 * Это метод возвращает тип данных String.
 * В нашей программе нужно будет String преобразовать
 * в int. Для этого мы будет использовать метод
 * Integer.parseInt
 *
 * 2. В методе main добавьте цикл. Игра заканчивается,
 * когда игрок забрал последние спички.
 * В цикле нужно проверять количество спичек.
 *
 * 3. Сделайте ввод данных от пользователя.
 * Сначала первый игрок вводит число от 1 до 3,
 * потом второй и так далее. Когда игрок ввел цифру,
 * нужно показать сколько спичек осталось на столе.
 *
 * 4. Добавьте валидацию пользовательского ввода:
 * перевод хода и пересчёт спичек должен производиться
 * только если введённое количество находится в пределах
 * от 1 до 3 (включительно), и при этом не больше
 * числа оставшихся спичек (count). В противном случае
 * пользователю должно быть показано сообщение об ошибке.
 *
 * boolean turn - возможна перемена хода и чей ход?
 * int count - количество спичек
 *
 */
public class ElevenGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + ", введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3 && matches <= count) {
                turn = !turn;
                count -= matches;
                System.out.println("На столе осталось " + count + " спичек");
            } else {
                System.out.println("Неправильный ввод, попробуйте ещё раз");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}