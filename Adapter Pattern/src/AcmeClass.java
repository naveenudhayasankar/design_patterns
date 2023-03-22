// Acme Objects are based on the AcmeClass which has four methods.
// The backend works with Acme Objects
public class AcmeClass implements AcmeInterface{
    private String firstName;
    private String lastName;


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
