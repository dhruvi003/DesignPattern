import creational.DatabaseConnectionManager;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager dbManager1 = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager dbManager2 = DatabaseConnectionManager.getInstance();

        // Confirm that both references point to the same instance
        System.out.println("Are both DB Managers the same instance? " + (dbManager1 == dbManager2));
    }
}
