package observers;

public class Manager implements Observer {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println("Manager " + name + ": Task '" + taskName + "' has changed to " + status);
    }
}
