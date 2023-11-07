package ПАК_ПС.testBranchOne;

public class Student {
    private String name;
    private int age;
    private double mark;
    private String country;

    public Student(String name, int age, double mark, String country) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                ", country='" + country + '\'' +
                '}';
    }
}
