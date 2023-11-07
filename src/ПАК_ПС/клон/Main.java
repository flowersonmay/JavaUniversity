package ПАК_ПС.клон;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Dmitry",21,3.5,"Russia"));
        students.add(new Student("Vlad",24,4,"USA"));
        students.add(new Student("Alex",20,3.9,"China"));
        students.add(new Student("Anton",35,5,"Russia"));
        students.add(new Student("Kate",19,4.5,"USA"));
        students.add(new Student("Natasha",25,3,"USA"));


    }
}
