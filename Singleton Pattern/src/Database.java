public class Database {
    private int record;
    private String name;
    /* The Singleton object which will be returned each time getInstance() is called. */
    private static Database dbSingleton;

    /* Non-public constructor eliminates creation of new objects from other classes*/
    private Database(String n){
        this.name = n;
        this.record = 0;
    }

    public void editRecord(String operation){
        System.out.println("Performing a/an " + operation + " on record " + record + " in database " + name);
    }

    public String getName(){
        return name;
    }

    /* A public, utility method which will check if an object of type Database already exists,
    * if yes, returns the same object, else creates a new object. */
    public static Database getInstance(String n){
        if(dbSingleton == null){
            dbSingleton = new Database(n);
        }

        return dbSingleton;
    }
}
