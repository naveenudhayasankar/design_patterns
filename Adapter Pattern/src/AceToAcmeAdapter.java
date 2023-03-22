public class AceToAcmeAdapter implements AcmeInterface{
    private AceClass aceObject;
    private String firstName;
    private String lastName;

    public AceToAcmeAdapter(AceClass aceObject){
        this.aceObject = aceObject;
        String[] names = aceObject.getName().split(" ");
        firstName = names[0];
        lastName = names[1];
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }
}
