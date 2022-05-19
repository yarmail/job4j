package ru.job4j.exceptionuser;

/*
0.5. Иерархия исключений и множественный catch. [#219368]

Задание

1. Создайте класс UserNotFoundException
наследника от Exception.

2. Создайте класс UserInvalidException
наследника от UserNotFoundException.

3. Создайте класс User

4. Вам необходимо реализовать метод findUser, validate и main.
findUser - если пользователя не нашли в списке,
то кинуть исключение UserNotFoundException.

validate - если пользователь не валидный
или если имя пользовател я состоит из менее
трех символов, то кинуть исключение UserInvalidException
Метод validate принимает аргумент user.

У объекта user есть метод isValid().
Если он false, то нужно выкинуть
исключение UserInvalidException.

Так же в этом методе нужно проверить,
что у объекта user количество символов
в поле username меньше 3.
Если оно меньше, то нужно выкинуть
исключение UserInvalidException.

Для этого нужно воспользоваться методом String.length().

main - поправить код за счет использования
try-catch с множественным блоком catch.

В блоке catch(UserNotFoundException)
- должно быть выведено на консоль сообщение,
что пользователя не найдено.

В блоке  catch(UserInvalidException) -
должно быть выведено на консоль сообщение,
что пользователь не валидный.
 */