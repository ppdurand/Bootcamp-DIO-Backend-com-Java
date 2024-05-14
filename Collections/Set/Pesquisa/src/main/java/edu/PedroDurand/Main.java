package edu.PedroDurand;

public class Main {
    public static void main(String[] args) {
        ToDoList set = new ToDoList();

        set.addTask("Tarefa 1");
        set.addTask("Tarefa 2");
        set.addTask("Tarefa 3");
        set.addTask("Tarefa 4");
        set.addTask("Tarefa 5");
        set.addTask("Tarefa 6");
        set.addTask("Tarefa 7");
        set.addTask("Tarefa 8");

        System.out.println(set.getTaskSet());

        set.statusChanger("Tarefa 5");
        set.statusChanger("Tarefa 7");
        set.statusChanger("Tarefa 1");

        set.getConludeTask();
        set.getPendingTask();

        System.out.println(set.getTaskSet());
        set.taskCount();

        set.removeTask("Tarefa 3");

        set.statusChanger("Tarefa 1");

        System.out.println(set.getTaskSet());
        set.cleanTasks();
        System.out.println(set.getTaskSet());
    }
}