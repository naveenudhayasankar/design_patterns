public class Client implements Observer{
    public Client() {

    }

    public void update(String operation, String record) {
        System.out.println("The client was notified of a/an " + operation + " on " + record);
    }
}
