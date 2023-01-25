public interface Observer {
    /* You pass the database operation that was performed (such as
        “edit”, “delete”, “create” and so on) and the record that was changed as
        strings to the update method.*/
    void update(String operation, String record);
}
