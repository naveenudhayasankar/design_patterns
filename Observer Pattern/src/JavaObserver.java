public class JavaObserver {
    public static void runJavaObserver() {
        ModifiedDatabase db = new ModifiedDatabase();
        ModifiedArchiver archiver = new ModifiedArchiver();
        ModifiedClient client = new ModifiedClient();
        ModifiedBoss boss = new ModifiedBoss();

        db.addObserver(archiver);
        db.addObserver(client);
        db.addObserver(boss);

        db.editRecord("add", "first record");

        db.deleteObserver(boss);

        db.editRecord("delete", "first record");
    }
}
