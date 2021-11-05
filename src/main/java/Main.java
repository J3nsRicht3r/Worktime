import db.data.Employee;
import db.write.EmployeeWriteCsv;

public class Main {

    public static void main(String[] args) {
        EmployeeWriteCsv test = new EmployeeWriteCsv(new Employee("3", "Max", "Mustermann"));
        test.Raw();
        test.WriteCsv();
        //System.out.println(test.Raw());
    }
}
