package ru.job4j.sortuser;

/*
Organize User sorting in two fields
Организовать сортировку User ПО 2 полям
[#10034]

Теория
В Java есть интерфейс java.util.Set.
Классы этого интерфейса -
это java.util.HashSet и java.util.TreeSet.

Как вы знаете эти коллекции имеют свои особенности.
Они не содержат дубликатов.

В этом уроке мы поговорим про java.util.TreeSet.
Это коллекция так же сразу сортирует элементы.

---

Задание.
В этом задании нужно осуществить сортировку
для модели User
В модели должны быть поля: имя и возраст.
Предусмотреть ситуацию, если два пользователя имеют
одинаковое имя, то нужно проверить
сравнить тогда их возраст.

Класс User должен реализовать интерфейс Comparable.

---

Варианты toString (old version)

Вариант 1
В классе User
@Override
public String toString() {
return String.format("User: %s, %s", this.name, this.age);
}

Вариант 2
В классе SortUserTest
assertThat(result.toString(), is(
"[User: Vovan, 10, User: Ivan, 20, User: Kolyan, 50]"));

*/
