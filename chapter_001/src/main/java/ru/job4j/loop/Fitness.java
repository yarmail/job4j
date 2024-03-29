package ru.job4j.loop;

/**
 * 5.4. Протеиновая диета [#156313] Цикл while.
 * (есть тесты)
 */
public class Fitness {

    /**
     * Задача
     * В тренажерный зал пришли новые спортсмены
     * - Иван и Николай. Они хотят прогрессировать очень
     * быстро и поэтому употребляют много протеина.
     *
     * Иван за месяц увеличивает силу тяги в 3 раза
     * за счет такой диеты, а Николай - за месяц
     * увеличивает силу тяги в 2 раза.
     *
     * Иван хочет узнать, сколько месяцев
     * ему нужно тренироваться, чтобы обогнать Николая в тяге.
     *
     * Начальная сила тяги спортсменов задается
     * через аргументы методов.
     *
     * Метод должен вычислять количество месяцев,
     * которое необходимо Ивану,
     * чтобы обогнать в тяге Николая.
     *
     * Пример:
     * Если Иван тянет 90 кг, а Николай 100 кг,
     * то Ивану нужен один месяц, чтобы обогнать Николая.
     * 90 * 3 = 270 - Иван через месяц.
     * 100 * 2 = 200 - Николай через месяц.
     * month += 1; ---- month = month + 1
     * ivan *= 3; ---- ivan = ivan * 3
     * nik *= 2; ----- nik = nik * 2
     */
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            month += 1;
            ivan *= 3;
            nik *= 2;
        }
        return month;
    }
}