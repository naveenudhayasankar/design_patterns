public class CustomObserver {
    public static void runCustomObserver() {
        Database db = new Database();
        Archiver archiver = new Archiver();
        Client client = new Client();
        Boss boss = new Boss();

        db.addObserver(archiver);
        db.addObserver(client);
        db.addObserver(boss);

        db.editRecord("add", "first record");
        db.editRecord("edit", "first record");

        db.removeObserver(boss);

        db.editRecord("delete", "first record");
    }
}
