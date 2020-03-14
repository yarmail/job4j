package ru.job4j.tracker;



/**
 * Описание
 *
 *
 *
 */

/*
СТАРЫЕ ВЕРСИИ МЕТОДОВ класса Tracker

---- Изменен способ хранения заявок - старая версия
position - показывает количество заявок
    private final Item[] items = new Item[100];

---- add - решение через массивы
this.items[this.position++] = item;


---- findById ---- решение через массивы -----
for (int i = 0; i < this.position; i++) {
    if ((this.items[i] != null) && (this.items[i].getId()).equals(id)) {
    result = items[i];
    break;

---- findAll ---- решение через массивы ----
Item[] result = Arrays.copyOf(this.items, this.position);

--- findByName - решение через масивы
int count = 0;
Item[] tmp = new Item[this.position];
for (int i = 0; i < this.position; i++) {
    if ((this.items[i] != null) && (this.items[i].getName().equals(key))) {
    tmp[count] = this.items[i];
    count++;
    Item[] result = Arrays.copyOf(tmp, count);

--- delete - удаление заявок решение через массивы -----
for (int i = 0; i < this.position; i++) {
    if ((this.items[i] != null) && this.items[i].getId().equals(id)) {
        System.arraycopy(this.items, (i + 1), this.items, i, this.position - (i + 1));
        this.position--;
        this.items[this.position] = null;
        result = true;
        break;

---- replace - замена заявки решение через массивы -----
for (int i = 0; i < this.position; i++) {
    if (this.items[i].getId().equals(id)) {
        items[i] = item;
        item.setId(id);
        result = true;
        break;
*/