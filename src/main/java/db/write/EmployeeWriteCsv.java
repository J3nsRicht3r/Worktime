package db.write;

import db.data.Employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmployeeWriteCsv {
    private final int eid;
    private final String firstname;
    private final String lastname;
    private String raw;

    public EmployeeWriteCsv(Employee employeelist) {
        this.eid = employeelist.getEID();
        this.firstname = employeelist.getFirstName();
        this.lastname = employeelist.getLastName();
    }

    public String Raw() {
        raw = eid + "," + firstname + "," + lastname;
        return raw;
    }

    public void WriteCsv() {
        try {
            String filename = "D:\\Worktime\\src\\main\\resources\\employee.csv";
            File file = new File(filename);
            file.createNewFile();
            PrintWriter writeraw = new PrintWriter(new FileWriter(file, true), true);
            writeraw.println(raw);
            writeraw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
