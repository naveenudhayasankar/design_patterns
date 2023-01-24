public abstract class ConnectionFactory {
    public ConnectionFactory(){

    }

    public abstract Connection createConnection(String type);
}
