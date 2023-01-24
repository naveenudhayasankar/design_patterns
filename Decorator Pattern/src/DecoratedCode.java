public class DecoratedCode {

    public static void runDecoratedCode() {
        Computer computer = new Computer();
        /**
         *  If you wrap a computer object, whose description method returns the
         * text "This is a computer", in a Disk wrapper, when the wrapper’s description
         * method adds the text "with a hard disk", you end up with the total text "This is a computer
         * with a hard disk". That’s what you get from the Disk wrapper’s description
         * method at this point. */
        computer = new Disk(computer);
        computer = new Monitor(computer);
        computer = new Keyboard(computer);
        computer = new CD(computer);

        System.out.println(computer.description());
    }

    public static class Computer {
        public Computer(){

        }

        public String description(){
            return "This is a computer";
        }
    }

    /** The abstract class that all Computer class wrappers will extend*/
    public static abstract class ComponentDecorator extends Computer {
        public abstract String description();
    }

    /** Wrapper (Decorator classes) for the Computer class*/
    public static class Disk extends ComponentDecorator {
        Computer computer;

        public Disk(Computer c) {
            computer = c;
        }

        public String description() {
            return computer.description() + " with a hard disk";
        }
    }

    public static class CD extends ComponentDecorator {
        Computer computer;

        public CD(Computer c) {
            computer = c;
        }

        public String description() {
            return computer.description() + " and a CD";
        }
    }

    public static class Monitor extends ComponentDecorator {
        Computer computer;

        public Monitor(Computer c) {
            computer = c;
        }

        public String description() {
            return computer.description() + " and a monitor";
        }
    }

    public static class Keyboard extends ComponentDecorator {
        Computer computer;

        public Keyboard(Computer c) {
            computer = c;
        }

        public String description() {
            return computer.description() + " and a keyboard";
        }
    }

}
