public class Boss implements Observer {
    public Boss() {

    }

    public void update(String operation, String record) {
        System.out.println("The boss was notified of a/an " + operation + " on " + record);
    }
}
