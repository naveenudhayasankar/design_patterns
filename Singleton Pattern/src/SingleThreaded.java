public class SingleThreaded {
    public static void runSingleThreaded() {
        Database db = Database.getInstance("products");
        System.out.println("This is the " + db.getName() + " database");
        /* Same instance of the products database is returned. The students database is not created. */
        db = Database.getInstance("students");
        System.out.println("This is the " + db.getName() + " database");
    }
}
