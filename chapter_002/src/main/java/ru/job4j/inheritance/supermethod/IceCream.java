package ru.job4j.inheritance.supermethod;

/**
 * 5. Вызов переопределенного метода родителя
 * - super.method ... [#504871]
 *
 * Наследование
 *  * Рассмотрим пример с расчетом мороженного.
 *  Есть киоск по продаже мороженного. Когда вы покупаете
 *  шарик мороженного в него можно добавить топпинги.
 *  За каждый топпинг нужно доплатить.
 *
 * Такой случай можно представить иерархией:
 * IceCream -> IceCream + Jam -> IceCream + Jam + Nuts.
 *
 * Каждый наследник должен добавить к сумме родителя
 * свою стоимость и для этого мы используем вызов
 * super.price().
 *
 * (1 уровень)
 */
public class IceCream {
    private int weight;

    public IceCream(int weight) {
        this.weight = weight;
    }

    public int price() {
        return weight * 100;
    }
}