package edu.PedroDurand;

import java.util.HashSet;
import java.util.Set;

public class ToDoList {
    private Set<Task> taskSet;

    public ToDoList() {
        this.taskSet = new HashSet<>();
    }

    public Set<Task> getTaskSet() {
        return taskSet;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "taskSet=" + taskSet +
                '}';
    }

    public void addTask(String description){
        taskSet.add(new Task(description));
    }

    public void removeTask(String description){
        for(Task t : taskSet){
            if(t.getDescription() == description){
                taskSet.remove(t);
                break;
            }
        }
    }


    public int taskCount(){
        return taskSet.size();
    }

    public Set<Task> getConludeTask(){
        Set<Task> concludeTask = new HashSet<>();
        for(Task t : taskSet){
            if(t.getStatus() == TaskStatus.CONCLUIDA){
                concludeTask.add(t);
            }
        }
        return concludeTask;
    }

    public Set<Task> getPendingTask(){
        Set<Task> pendingTask = new HashSet<>();
        for(Task t : taskSet){
            if(t.getStatus() == TaskStatus.PENDENTE){
                pendingTask.add(t);
            }
        }
        return pendingTask;
    }

    public void statusChanger(String description){
        for (Task t : taskSet){
            if(t.getDescription() == description){
                if(t.getStatus() == TaskStatus.CONCLUIDA){
                    t.setStatus(TaskStatus.PENDENTE);
                }else{
                    t.setStatus(TaskStatus.CONCLUIDA);
                }
            }
        }
    }

    public void cleanTasks(){
        taskSet.removeAll(taskSet);
    }

}
