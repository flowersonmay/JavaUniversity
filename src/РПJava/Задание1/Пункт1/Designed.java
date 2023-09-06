package РПJava.Задание1.Пункт1;

class Designer extends Employee {
    private String designTool;

    public Designer(String name, int employeeId, double salary, String designTool) {
        super(name, employeeId, salary);
        this.designTool = designTool;
    }

    @Override
    public String getDetails() {
        return "Designer: " + getName() + ", ID: " + getEmployeeId() + ", Salary: " + getSalary() + ", Design Tool: " + designTool;
    }
}
