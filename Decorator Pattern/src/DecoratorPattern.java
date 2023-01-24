public class DecoratorPattern {
    public static void main(String[] args){
        NonDecoratedCode.runNonDecoratedCode();
        System.out.println("********************");
        DecoratedCode.runDecoratedCode();
    }
}
