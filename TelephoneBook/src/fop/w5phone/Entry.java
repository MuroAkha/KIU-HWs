package fop.w5phone;
public class Entry {
    private String lastName;
    private String firstName;
    private String phoneNumber;

    public Entry(String lastName, String firstName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

