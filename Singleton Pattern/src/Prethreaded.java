public class Prethreaded implements Runnable{
    Thread t;

    public static void runPrethreaded() {
        Prethreaded pt = new Prethreaded();
    }

    public Prethreaded(){
        /* Creates a products database */
        DatabasePreThreaded dbPreThreaded = DatabasePreThreaded.getInstance("products");
        /* New thread, upon running tries to create an employees database*/
        t = new Thread(this, "second");
        t.start();
        System.out.println("This is the " + dbPreThreaded.getName() + " database");
    }
    public void run() {
        /* This will fail as an instance of DatabasePreThreaded already exists */
        System.out.println("Second thread executing...");
        DatabasePreThreaded dbPreThreaded = DatabasePreThreaded.getInstance("employees");
        System.out.println("This is the " + dbPreThreaded.getName() + " database");
    }
}
