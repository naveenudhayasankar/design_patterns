import java.util.Observable;
import java.util.Observer;

public class ModifiedArchiver implements Observer {
    public ModifiedArchiver() {

    }
    public void update(Observable o, Object arg) {
        System.out.println("The archiver is notified of a/an " + ((ModifiedDatabase)o).getOperation() + " on " + ((ModifiedDatabase)o).getRecord());
        //System.out.println("The archiver also received a notification from an object: " + arg.toString());
    }
}
