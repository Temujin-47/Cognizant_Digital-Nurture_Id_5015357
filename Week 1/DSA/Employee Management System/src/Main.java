public class Main {
    private Employee[] employees;
    private int count;

    public Main(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Employee list is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; // not found
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Shift elements to the left to fill the gap
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--count] = null; // Clear the last element
            System.out.println("Employee with ID " + employeeId + " has been deleted.");
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }
    }

    public static void main(String[] args) {
        Main ems = new Main(10);

        ems.addEmployee(new Employee(1, "Xavi Simmons", "Stylist", 40000));
        ems.addEmployee(new Employee(2, "Vini Jr", "Manager", 10000));
        ems.addEmployee(new Employee(3, "Cole Palmer", "Designer", 50000));

        System.out.println("All employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for employee with ID 2:");
        Employee emp = ems.searchEmployee(2);
        System.out.println(emp != null ? emp : "Employee not found.");

        System.out.println("\nDeleting employee with ID 2:");
        ems.deleteEmployee(2);

        System.out.println("\nAll employees after deletion:");
        ems.traverseEmployees();
    }
}
