public class NonDecoratedCode {

    public static void runNonDecoratedCode() {
        Computer c = new Computer();
        c.description();
    }

    /** Frequent changes to the description() method is not desirable. */
    public static class Computer {
        public void description() {
            System.out.println("This is a computer with a hard disk and a monitor.");
        }
    }
}
