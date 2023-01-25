public class SingletonPattern {
    public static void main(String[] args){
        SingleThreaded.runSingleThreaded();
        System.out.println("********************");
        Multithreaded.runMultithreaded();
        System.out.println("********************");
        Prethreaded.runPrethreaded();
    }
}
