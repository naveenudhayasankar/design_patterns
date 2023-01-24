public class NonFactoredCode {

    public static void runNonFactoredCode() {
        /* Creating connections separately */
        Connection c = new OracleConnection();
        Connection c1 = new SqlServerConnection();
        Connection c2 = new MySqlConnection();
        System.out.println(c.description());
        System.out.println(c1.description());
        System.out.println(c2.description());

        /* Encapsulating connection creation process into createConnection() method */
        Connection connection = createConnection("Oracle");
        Connection connection1 = createConnection("MySQL");
        Connection connection2 = createConnection("SQL Server");
        System.out.println(connection.description());
        System.out.println(connection1.description());
        System.out.println(connection2.description());
    }

    /** Using new operator to instantiate many, different concrete objects which can be cumbersome when the code is large
     * and had to be replicated in many places.*/
    public static Connection createConnection(String type) {
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
