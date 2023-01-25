import java.util.Observable;
import java.util.Observer;

public class ModifiedBoss implements Observer {
    public ModifiedBoss() {

    }

    public void update(Observable o, Object arg) {
        System.out.println("The boss is notified of a/an " + ((ModifiedDatabase)o).getOperation() + " on " + ((ModifiedDatabase)o).getRecord());
    }
}
