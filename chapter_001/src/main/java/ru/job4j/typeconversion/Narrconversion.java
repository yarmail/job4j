package ru.job4j.typeconversion;

/**
 * Однако необходимо быть крайне аккуратными,
 * поскольку некоторые преобразования могут
 * производиться автоматически между типами данных
 * одинаковой разрядности или даже от типа данных
 * с большей разрядностью к типу с меньшей разрядностью.
 * На схеме это следующие цепочки:
 * int -> float; long -> float и long -> double.
 * Преобразования производятся без ошибок компиляции,
 * однако при преобразовании мы можем столкнуться
 * с потерей данных.
 *
 * Мы видим что в консоль выводится значение,
 * отличное от того, которое мы записали
 * в переменную с типом int.
 *
 */
public class Narrconversion {

    /**
     * пример неявного преобразования
     */
    public static void intToFloat() {
        int i = 2_147_483_600;
        float f = i;
        System.out.println("Вывод в консоль значения после преобразования: " + f);
    }
    /*
    Вывод:
    Вывод в консоль значения после преобразования: 2.14748365E9
    */

    /**
     * Сужающие преобразования не всегда безопасны:
     * для примера число 100 с типом int преобразовать
     * в тип byte - имеет смысл, поскольку мы попадаем
     * в диапазон допустимых значений. А вот преобразовать
     * число 100000 с типом int в byte - не получится без потери
     * данных, поскольку такое значение выходит за
     * пределы от -127 до 128. Именно поэтому
     * компилятор будет выдавать ошибку преобразования,
     * даже если преобразуемое значение укладывается
     * в более узкий диапазон указанного типа -
     * представленный ниже код не скомпилируется
     *
     * Для того чтобы код скомпилировался
     * произведем явное преобразование типов:
     *
     * Преобразование в тип short осуществилось
     * без потерь данных, однако результат преобразования
     * в byte - весьма неожиданный, поскольку на выходе
     * мы получили значение 16. Почему? Поскольку значение
     * 10000 находится вне диапазона допустимых значений
     * для типа byte, то происходит усечение значения. Д
     * авайте разберемся почему получается значение 16.
     *
     * Число i, равное 10000, в двоичном исчислении будет
     * равно 100111 0001 0000. Значения типа byte занимают
     * в памяти только 8 бит. Поэтому двоичное представление
     * числа int усекается до 8 правых разрядов,
     * т.е. 0001 0000 - что в десятичной системе дает число 16.
     *
     */
    public static void intToByte() {
        int i = 10000;
        byte b = (byte) i;
        short s = (short) i;
        System.out.println("Вывод в консоль значения после преобразования: " + b);
        System.out.println("Вывод в консоль значения после преобразования: " + s);
    }
    /* Вывод
    Вывод в консоль значения после преобразования: 16
    Вывод в консоль значения после преобразования: 10000
     */

    /**
     * Сужающее приведение примитивных типов чаще всего
     * используют для преобразования значений с плавающей
     * точкой в целые числа. При этом дробная часть значения
     * с плавающей точкой просто отбрасывается
     * (т.е. значение с плавающей точкой округляется
     * по направлению к нулю, а не к ближайшему целому числу.
     * Получается что правила округления в данном
     * случае не работают).
     * Чтобы избежать подобных проблем можно
     * использовать функцию округления,
     * которая определена в java.lang.Math
     *
     * Понижающее преобразование для типа char
     * выполняется аналогичным образом.
     * При этом значения варьируются от 0 до 65536.
     * Почему такой большой диапазон? Все из-за того,
     * что char хранит в себе не только буквы,
     * но знаки препинания, иероглифы и т.п
     * Если же мы передадим значение, которое выходит
     * за пределы от 0 до 65536, то будет происходить
     * усечение и потеря данных.
     */
    public static void doubleToInt() {
        double d = 94.984751;
        int i = (int) Math.round(d);
        System.out.println("Вывод в консоль значения после преобразования: " + i);

    }
    /*
    Вывод:
    Вывод в консоль значения после преобразования: 958
     */

    public static void main(String[] args) {
         intToFloat();
         intToByte();
         doubleToInt();
    }
}
