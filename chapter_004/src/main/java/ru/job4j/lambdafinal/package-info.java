package ru.job4j.lambdafinal;

/**
 * Variables in lambda expressions.
 * Visibility and effectively final
 * Переменные в lambda выражениях.
 * Зона видимости и effectively final
 *

 Чтобы избежать любых проблем в лямбда выражениями
 все переменные нужно обозначать final.

 Посмотрите на код.

 List<String> names = Arrays.asList("Petr", "Nick", "Ban");
 String last = null;
 names.forEach(
 n -> last = n
 );

 Так делать нельзя. В лямбдах нельзя преобразовывать
 переменные объявленные вне выражения.
 Чтобы этого избежать нужно использовать
 ссылочные типы в которых есть возможность установить данные.
 В данном случае код можно переделать на StringBuilder.

 final StringBuilder last = new StringBuilder();
 names.forEach(
 n ->  {
 last.ensureCapacity(0);
 last.append(n);
 }
 );
 *
 */
