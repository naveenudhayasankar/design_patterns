public class Composition {
    /**
     * Separating the volatile code from the rest of the code.
     * If we know that the go() method is going to change a lot, separate it out.
     */
    public static void runComposition() {
        StreetCar sc = new StreetCar();
        sc.go();

        FormulaOne fOne = new FormulaOne();
        fOne.go();

        Helicopter heli = new Helicopter();
        heli.go();

        Jet jet = new Jet();
        jet.go();

        /** Selecting algorithms dynamically */

        jet.setGoAlgorithm(new GoByDriving());
        jet.go();
        jet.setGoAlgorithm(new GoByFlyingFast());
        jet.go();
        jet.setGoAlgorithm(new GoByDriving());
        jet.go();
    }

    /**
    *  Separating the go() method into an abstract class which will have various implementations.
     *  Any changes will to the go() method will happen to the implemented classes rather than at each subclass level.
     */
    public interface GoAlgorithm {
        void go();
    }

    /**
     * Various implementations of the go() method
     */
    public static class GoByDriving implements GoAlgorithm {
        public void go() {
            System.out.println("Now I'm driving");
        }
    }

    public static class GoByFlying implements GoAlgorithm {
        public void go() {
            System.out.println("Now I'm flying at 200 mph");
        }
    }

    public static class GoByFlyingFast implements GoAlgorithm {
        public void go() {
            System.out.println("Now I'm flying fast");
        }
    }

    public static abstract class Vehicle {
        private GoAlgorithm goAlgorithm;
        public Vehicle() {

        }

        /** Setting the goAlgorithm, this will be used by the subclasses to specify which goAlgorithm to use */
        public void setGoAlgorithm(GoAlgorithm goAlgorithm) {
            this.goAlgorithm = goAlgorithm;
        }

        public void go() {
            goAlgorithm.go();
        }
    }

    public static class StreetCar extends Vehicle {
        public StreetCar() {
            setGoAlgorithm(new GoByDriving());
        }
    }

    public static class FormulaOne extends Vehicle {
        public FormulaOne() {
            setGoAlgorithm(new GoByDriving());
        }
    }

    public static class Helicopter extends Vehicle {
        public Helicopter() {
            setGoAlgorithm(new GoByFlying());
        }
    }

    public static class Jet extends Vehicle {
        public Jet() {
            setGoAlgorithm(new GoByFlyingFast());
        }
    }
}
