package РПJava.Задание2.Пункт1;

import РПJava.Задание2.Functions;
import РПJava.Задание2.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList;
        studentArrayList = Functions.getArrayStudents();
        System.out.println("Распечатать содержимое листа");
        studentArrayList.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");


        System.out.println("Изменить ID третьего студента");
        studentArrayList.get(3).setId(2004);
        System.out.println(studentArrayList.get(3));
        System.out.println("--------------------------------------------------------------");


        System.out.println("Удалить последнего студента");
        studentArrayList.remove(studentArrayList.size() - 1);
        studentArrayList.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");


        System.out.println("Отсортировать студентов в порядке убывания возраста");
        studentArrayList = (ArrayList<Student>) studentArrayList.stream()
                .sorted(Comparator.comparing(Student::getDateOfBirthday).reversed())
                .collect(Collectors.toList());
        studentArrayList.forEach(System.out::println);


        System.out.println("--------------------------------------------------------------");
        System.out.println("Удалить всех");
        studentArrayList.removeAll(studentArrayList);
        studentArrayList.forEach(System.out::println);
        System.out.println("Размер списка: " + studentArrayList.size());


    }

}
