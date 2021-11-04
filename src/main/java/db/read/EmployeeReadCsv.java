package db.read;

import db.data.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class EmployeeReadCsv {
    int id;
    String firstname;
    String lastname;

    public ArrayList<Employee> ReadCsv() throws IOException {
        String fileName = "employee.csv";

        FileReader input = new FileReader(fileName);
        try (BufferedReader fileReader = new BufferedReader(input)) {
            String raw;
            ArrayList<Employee> employeelist = new ArrayList();

            raw = fileReader.readLine();
            while (raw != null) {
                var tokens = raw.split(",");
                if (tokens.length <= 0) {
                    var employee = new Employee(
                            id,
                            firstname,
                            lastname
                    );
                    employeelist.add(employee);
                }
                raw = fileReader.readLine();
            }
            return employeelist;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;


    }


}
