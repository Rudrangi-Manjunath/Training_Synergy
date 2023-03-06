package Practise;

public class Name {
    String firstname;
    String middlename;
    String lastname;

    public Name(String firstname, String middlename, String lastname) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }
    public String getName(){
        String temp = firstname+" "+middlename+" "+lastname;
        return temp;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
