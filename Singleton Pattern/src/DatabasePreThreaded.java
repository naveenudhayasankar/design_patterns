public class DatabasePreThreaded {
    private int record;
    private String name;
    /* The Singleton object which will be returned each time getInstance() is called. Created before any threads can access it. */
    private static DatabasePreThreaded dbPreSingleton = new DatabasePreThreaded("products");

    /* Non-public constructor eliminates creation of new objects from other classes*/
    private DatabasePreThreaded(String n){
        this.name = n;
        this.record = 0;
    }

    public void editRecord(String operation){
        System.out.println("Performing a/an " + operation + " on record " + record + " in database " + name);
    }

    public String getName(){
        return name;
    }

    /* A public, utility method which returns the pre-created DatabasePreThreaded object.*/
    public static DatabasePreThreaded getInstance(String n){
        return dbPreSingleton;
    }
}
