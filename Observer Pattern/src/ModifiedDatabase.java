import java.util.Observable;

public class ModifiedDatabase extends Observable {
    private String operation;
    private String record;
    private class GenericObject {
        private String op;
        private String rec;
        public void GenericObject(){

        }
    }

    public ModifiedDatabase() {

    }

    public void editRecord(String op, String rec){
        operation = op;
        record = rec;
        /* The following functions are exposed by java.util.Observable */
        /* If setChanged() is not called, the observers will not be notified */
        setChanged();
        /* Calling notifyObservers() without any arguments */
        notifyObservers();

        /** Passing an object to notifyObservers(), this object will be available as the second argument of the Observer's update method
         * GenericObject obj = new GenericObject();
         * obj.op = operation;
         * obj.rec = record;
         * notifyObservers(obj);
         * At a time, only one way of calling notifyObservers() should be used.
        */
    }

    /* Getters for exposing the subject's data to the observers */
    public String getOperation(){
        return operation;
    }

    public String getRecord(){
        return record;
    }
}
