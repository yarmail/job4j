package ru.job4j.streambuild;

/*
8. Шаблоны проектирования в Stream API [#310012]
Builder

Если мы посмотрим на интерфейс Stream,
то в нем определен вложенный интерфейс Builder

Когда стоит использовать шаблон проектирования
Builder (Строитель):
1. Когда мы хотим избавиться от конструктора
с большим количеством параметров
(случай описанный в задании);
2. Когда код должен создавать разные
представления какого-то объекта.
Например, когда нам надо инициализировать
лишь несколько полей из всего набора;
3. Когда нам необходимо собирать
сложные объекты, т.е. когда поля в классе
являются экземплярами других классов.

Преимущества использования шаблона Строитель:
1. Позволяет создавать объекты пошагово;
2. Позволяет использовать один и тот же
код для создания различных объектов -
если использовать не класс Builder,
а interface с таким именем, тогда можно
создавать различные имплементации
этого интерфейса (в данном задании мы
это не рассматривали);
3. Сложный код сборки объекта от основной
бизнес логики будет изолирован.
Недостатки использования шаблона Строитель:
1. Усложняет код программы из-за введения
дополнительных классов.

---

Задание
Представлен класс Car
Вам необходимо выполнить следующее:
- корректно реализовать методы buildFieldName(),
методы должны заполнять соответствующие поля
и возвращать тип Builder;

- реализовать метод build(), который выполнит
окончательное конструирование нашего объекта;

- переопределите метод toString() для класса Car;

- в методе main создайте еще один объект
Car с помощью Builder (можете заполнять не все поля)
и выводите созданный объект в консоль.
 */