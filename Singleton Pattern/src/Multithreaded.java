public class Multithreaded implements Runnable{
    Thread t;

    public static void runMultithreaded() {
        Multithreaded mt = new Multithreaded();
    }

    public Multithreaded(){
        /* Creates a products database */
        DatabaseSynchronized dbSync = DatabaseSynchronized.getInstance("products");
        /* New thread, upon running tries to create an employees database*/
        t = new Thread(this, "second");
        t.start();
        System.out.println("This is the " + dbSync.getName() + " database");
    }
    public void run() {
        /* This will fail as an instance of DatabaseSynchronized already exists */
        System.out.println("Second thread executing...");
        DatabaseSynchronized dbSync = DatabaseSynchronized.getInstance("employees");
        System.out.println("This is the " + dbSync.getName() + " database");
    }
}
