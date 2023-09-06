package РПJava.Задание1.Пункт1;

abstract class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        if (salary < 10000) {
            throw new IllegalArgumentException("Salary cannot be less than 10,000");
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
    public abstract String getDetails();
}
