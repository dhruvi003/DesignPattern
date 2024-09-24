public class UserNotifier implements Observer {
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}
