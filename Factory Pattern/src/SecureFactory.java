public class SecureFactory extends ConnectionFactory {
    public Connection createConnection(String type) {
        if(type.equals("Oracle")){
            return new SecureOracleConnection();
        }
        else if(type.equals("SQL Server")){
            return new SecureSQLServerConnection();
        }
        else {
            return new SecureMySQLConnection();
        }
    }
}
