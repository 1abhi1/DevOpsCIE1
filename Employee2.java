public class Employee2 {
    private String name;
    private String empId;
    private double salary;

    public Employee2(String name, String empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee2 employee = new Employee2("John Smith", "E12345", 75000.0);
        employee.displayEmployeeDetails();
    }
}


