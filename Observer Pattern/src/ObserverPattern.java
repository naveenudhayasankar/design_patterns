public class ObserverPattern {
    public static void main(String[] args){
        CustomObserver.runCustomObserver();
        System.out.println("********************");
        JavaObserver.runJavaObserver();
    }
}
