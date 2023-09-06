package РПJava.Задание1.Пункт1;

class Programmer extends Employee implements ProgrammingLanguage {
    private String[] programmingLanguages;

    public Programmer(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public String getDetails() {
        return "Programmer: " + getName() + ", ID: " + getEmployeeId() + ", Salary: " + getSalary();
    }

    @Override
    public void setProgrammingLanguages(String[] languages) {
        this.programmingLanguages = languages;
    }

    @Override
    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }
}
