public final class FirstFactory {
    protected String type;

    /* Constructor sets the property type*/
    public FirstFactory(String t) {
        type = t;
    }

    /* Connection is created based on type*/
    public Connection createConnection(){
        if(type.equals("Oracle")){
            return new OracleConnection();
        }
        else if(type.equals("SQL Server")){
            return new SqlServerConnection();
        }
        else {
            return new MySqlConnection();
        }
    }
}
