package ru.job4j.sortcomby;

/**
 * 2. Комбинированный компаратор [#10036 #4097]
 * Модель с перечнем выполняемых работ
 * и приоритетом их выполнения
 *
 * Как работает комбинированный компаратор?
 * Если результат первого компаратора JobDescByName
 * равен 0, то есть объекты равны, то проверка
 * переходит ко второму компаратору JobDescByPriority.
 *
 * (есть тесты)
 */
public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + "name='" + name + '\''
                + ", priority=" + priority + '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
}