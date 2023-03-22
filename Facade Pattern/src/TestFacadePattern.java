public class TestFacadePattern {

    // Working with a poorly written object or interface
    public static void testDifficultProduct(){
        DifficultProduct dp = new DifficultProduct();
        dp.setFirstNameCharacter('P');
        dp.setSecondNameCharacter('r');
        dp.setThirdNameCharacter('i');
        dp.setFourthNameCharacter('n');
        dp.setFifthNameCharacter('t');
        dp.setSixthNameCharacter('e');
        dp.setSeventhNameCharacter('r');

        System.out.println("Difficult Product built: " + dp.getName());
    }

    public static void testSimpleProduct(){
        SimpleProductFacade sf = new SimpleProductFacade();
        sf.setName("Printer");
        System.out.println("Simple product built: " + sf.getName());
    }
}
