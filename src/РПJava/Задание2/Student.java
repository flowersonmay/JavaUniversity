package РПJava.Задание2;

import java.time.LocalDate;
import java.util.Random;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private LocalDate dateOfBirthday;
    private double avgRateJava;

    public Student(int id, String surname, String name,
                   String middleName, LocalDate dateOfBirthday,
                   double avgRateJava) {
        this.id = checkId(id);
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirthday = dateOfBirthday;
        this.avgRateJava = avgRateJava;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id= checkId(id);
    }
    public int checkId(int id){
        String s = String.valueOf(id);
        if (s.length() == 4) {
            return id;
        }
        else{
            Random random = new Random();
            return random.nextInt(1000,9999);
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName(){
        return this.name + " " + this.middleName + " " + this.middleName;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public double getAvgRateJava() {
        return avgRateJava;
    }

    public void setAvgRateJava(double avgRateJava) {
        this.avgRateJava = avgRateJava;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", avgRateJava=" + avgRateJava +
                '}';
    }
}
