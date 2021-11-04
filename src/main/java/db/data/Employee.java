package db.data;

public class Employee {
    int EID;
    String FirstName;
    String LastName;

    public Employee(String eid, String firstname, String lastname) {
        this.EID = Integer.parseInt(eid);
        this.FirstName = firstname;
        this.LastName = lastname;

    }

    public int getEID() {
        return EID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
}

