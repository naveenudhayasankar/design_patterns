import java.util.Vector;

public class Database implements Subject{
    private Vector<Observer> observers;
    private String operation;
    private String record;

    public Database(){
        observers = new Vector<>();
    }


    // Registering the observers
    public void addObserver(Observer o) {
        observers.add(o);
    }

    // Removing the observer
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // Send notification to all observers
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(operation, record);
        }
    }

    // When this action is performed, all registered observers are notified of the action
    public void editRecord(String operation, String record){
        this.operation = operation;
        this.record = record;
        notifyObservers();
    }
}
