package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int var = 0;
        for (Task element : tasks) {
            if(task.getPriority() < element.getPriority()) {
               var = 0;
            } else {
               var++;
            }
            break;

        }
        this.tasks.add(var, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
