package ru.job4j.condition;


/**
 * 4.5. Отладка программы в IDEA [#159464]
 * Программа ниже определяет максимум из трех чисел.
 * В ней есть ошибки.
 * С помощью отладки найдите ошибки и устраните их.
 * Проверьте себя тестами.
 * public class ThreeMax {
 *     public static int max(int first, int second, int third) {
 *         int result = first;
 *         if (first > second && first > third) {
 *             result = second;
 *         }
 *         if (second > first && second > third) {
 *             result = third;
 *         }
 *         return result;
 *     }
 * }
 *
 * (есть тесты)
 *
 */
public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first) {
            result = second;
        }
        if (third > second) {
            result = third;
        }
        return result;
    }
}
