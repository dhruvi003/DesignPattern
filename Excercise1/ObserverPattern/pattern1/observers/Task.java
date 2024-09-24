package observers;
// package behavioral;

import utils.CustomLogger;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private List<Observer> observers = new ArrayList<>();
    private String taskName;
    private String status;

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = "Not Started";
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(taskName, status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        CustomLogger.log(Level.INFO, "Task updated: " + taskName + " is now " + status);
        notifyObservers();
    }
}

