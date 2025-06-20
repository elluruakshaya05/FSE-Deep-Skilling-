
public class EmployeeManager {
    private Employee[] employees;
    private int count;  // tracks number of employees added

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add new employee
    public void addEmployee(Employee emp) {
        if (count >= employees.length) {
            System.out.println("Cannot add more employees. Array is full.");
            return;
        }
        employees[count++] = emp;
        System.out.println("Employee added.");
    }

    // Search employee by ID
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and display all employees
    public void displayAllEmployees() {
        if (count == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        // Shift elements to the left
        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[--count] = null;
        System.out.println("Employee deleted.");
    }
}

