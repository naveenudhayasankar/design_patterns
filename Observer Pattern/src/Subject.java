public interface Subject {
    /* Interface methods that all subjects must implement */
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
