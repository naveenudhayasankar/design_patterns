public class Polymorphism {

    public static void runPolymorphism(){
        Shape shape = new Shape();
        // Calls Shape's draw method
        shape.draw();
        // This assignment is valid because Rectangle extends Shape
        shape = new Rectangle();
        // Calls Rectangle's draw method
        shape.draw();
    }

    static class Shape {
        public void draw() {
            System.out.println("Drawing a shape");
        }
    }

    static class Rectangle extends Shape {
        public void draw() {
            System.out.println("Drawing a rectangle");
        }
    }
}
