package db.read;

import db.data.Employee;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class EmployeeReadCsv {
    private final int eid = 0;
    private final int firstname = 1;
    private final int lastname = 2;

    public ArrayList<Employee> ReadCsv() {

        String filename = "D:\\Worktime\\src\\main\\resources\\employee.csv";
        String raw;
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))) {
            ArrayList<Employee> employeelist = new ArrayList();
            raw = fileReader.readLine();

            while (raw != null) {
                String[] tokens = raw.split(",");
                if (tokens.length >= 0) {
                    var employee = new Employee(tokens[eid], tokens[firstname], tokens[lastname]);
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
