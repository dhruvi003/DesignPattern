import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<Observer> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    // Singleton Pattern
    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.notify(message);
        }
    }

    // Add a new task
    public void addTask(Task task) {
        if (!isValidTime(task.getStartTime()) || !isValidTime(task.getEndTime())) {
            notifyObservers("Error: Invalid time format.");
            return;
        }

        if (hasConflict(task)) {
            notifyObservers("Error: Task conflicts with an existing task.");
        } else {
            tasks.add(task);
            notifyObservers("Task added successfully. No conflicts.");
        }
    }

    // Remove a task by description
    public void removeTask(String description) {
        boolean removed = tasks.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
        if (removed) {
            notifyObservers("Task removed successfully.");
        } else {
            notifyObservers("Error: Task not found.");
        }
    }

    // View all tasks sorted by start time
    public void viewTasks() {
        if (tasks.isEmpty()) {
            notifyObservers("No tasks scheduled for the day.");
            return;
        }

        Collections.sort(tasks, Comparator.comparing(Task::getStartTime));
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // Check for conflicts
    private boolean hasConflict(Task newTask) {
        for (Task existingTask : tasks) {
            if (isOverlapping(existingTask, newTask)) {
                return true;
            }
        }
        return false;
    }

    // Time validation helper
    private boolean isValidTime(String time) {
        return time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]");
    }

    // Overlap check helper
    private boolean isOverlapping(Task t1, Task t2) {
        return t1.getEndTime().compareTo(t2.getStartTime()) > 0 &&
                t2.getEndTime().compareTo(t1.getStartTime()) > 0;
    }
}
