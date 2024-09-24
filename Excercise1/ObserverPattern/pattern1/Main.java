import observers.Task;
import observers.TeamMember;
import observers.Manager;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Implement Observer Pattern");

        TeamMember alice = new TeamMember("Alice");
        Manager bob = new Manager("Bob");

        task.registerObserver(alice);
        task.registerObserver(bob);

        task.setStatus("In Progress");
        task.setStatus("Completed");
    }
}
