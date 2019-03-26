package agenda;

public class Contact {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

    public Contact(){
        this.firstName = "No first name added yet";
        this.lastName = "No last name added yet";
        this.emailAddress = "No email address added yey";
        this.phoneNumber = "No phone number added yet";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress() { // sa nu mai arate " . @company" daca nu ii introduci numele
        if(!(this.firstName.equals("null") && this.lastName.equals("null")))
            this.emailAddress = this.firstName + "." + this.lastName + "@company";
    }

    @Override
    public String toString(){
        return  "First name: " + this.firstName + "\n" +
                "Last name: " + this.lastName + "\n" +
                "Email address: " + this.emailAddress + "\n" +
                "Phone number: " + this.phoneNumber + "\n";
    }

}
