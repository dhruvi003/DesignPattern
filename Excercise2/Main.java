import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        UserNotifier notifier = new UserNotifier();
        manager.addObserver(notifier);

        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter a command (add, remove, view, quit):");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();

                    System.out.println("Enter start time (HH:MM):");
                    String startTime = scanner.nextLine();

                    System.out.println("Enter end time (HH:MM):");
                    String endTime = scanner.nextLine();

                    System.out.println("Enter priority (High, Medium, Low):");
                    String priority = scanner.nextLine();

                    Task task = TaskFactory.createTask(description, startTime, endTime, priority);
                    manager.addTask(task);
                    break;

                case "remove":
                    System.out.println("Enter task description to remove:");
                    String taskToRemove = scanner.nextLine();
                    manager.removeTask(taskToRemove);
                    break;

                case "view":
                    manager.viewTasks();
                    break;

                case "quit":
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}
