import java.util.Observable;
import java.util.Observer;

public class ModifiedClient implements Observer {
    public ModifiedClient(){

    }

    public void update(Observable o, Object arg) {
        System.out.println("The client is notified of a/an " + ((ModifiedDatabase)o).getOperation() + " on " + ((ModifiedDatabase)o).getRecord());
    }
}
