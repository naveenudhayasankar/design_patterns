public class Archiver implements Observer{

    public Archiver() {

    }

    public void update(String operation, String record) {
        System.out.println("The archiver was notified of a/an " + operation + " on " + record);
    }
}
