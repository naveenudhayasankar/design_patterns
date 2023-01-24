public class Inheritance {

    /**
     * Inheritance establishes an Is-a relationship.
     * Streetcar is a vehicle, Formula One is a vehicle, Helicopter is a vehicle.
     * Inheritance spreads out the handling of a changeable task over several generations of classes.
     */
    public static void runInheritance() {
        StreetCar sc = new StreetCar();
        sc.go();

        FormulaOne fOne = new FormulaOne();
        fOne.go();

        Helicopter heli = new Helicopter();
        heli.go();

    }

    public static abstract class Vehicle {
        public Vehicle() {

        }

        public void go() {
            System.out.println("Now I'm driving");
        }
    }

    public static class StreetCar extends Vehicle {
        public StreetCar() {

        }
    }

    public static class FormulaOne extends Vehicle {
        public FormulaOne() {

        }
    }

    public static class Helicopter extends Vehicle {
        public Helicopter() {

        }

        /**
         * Overriding the base class's go() method.
         * More changes will be difficult to implement.
         * Using interfaces also doesn't help as each class and subclass has to still implement the go() method.
         */
        public void go() {
            System.out.println("Now I'm flying");
        }
    }
}
