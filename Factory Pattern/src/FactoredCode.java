public class FactoredCode {

    public static void runFactoredCode() {
        /* Everything is encapsulated inside FirstFactory, but FirstFactory cannot be extended */
        FirstFactory factory = new FirstFactory("Oracle");
        Connection connection = factory.createConnection();
        System.out.println(connection.description());

        /* Factory created in GoF way, creating an abstract Factory class that can be extended. The method implementations will be done in the subclasses. */
        SecureFactory sf = new SecureFactory();
        Connection secureConnection = sf.createConnection("SQL Server");
        System.out.println(secureConnection.description());
    }
}
