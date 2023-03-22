public class TestObjectAdapter {
    public static void testAdapter(){
        // Ace object which has the full name
       AceClass aceObject = new AceClass();
       aceObject.setName("Bruce Wayne");

       // AceToAcme adapter which will allow using AcmeClass' getFirstName and getLastName methods using an Ace object
       AceToAcmeAdapter adapter = new AceToAcmeAdapter(aceObject);

       System.out.println("First Name: " + adapter.getFirstName());
       System.out.println("Last Name: " + adapter.getLastName());


    }
}
