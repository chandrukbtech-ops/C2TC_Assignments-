import com.chan.assignment.employees.Manager;
import com.chan.assignment.employees.Developer;
import com.yourname.assignment.utilities.EmployeeUtilities;

/**
 * Main class to test Employee, Manager, Developer, and EmployeeUtilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 75000, "HR");
        Developer developer = new Developer("Bob", 102, 65000, "Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        EmployeeUtilities.updateSalary(manager, 80000);
        EmployeeUtilities.updateSalary(developer, 70000);

        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
