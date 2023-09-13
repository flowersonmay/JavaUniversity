package РПJava.Задание2.Пункт2;

import РПJava.Задание2.Student;

import java.time.LocalDate;
import java.util.ArrayDeque;

public class Queue {
    public static void main(String[] args) {
        System.out.println("____________ОЧЕРЕДЬ____________");
        ArrayDeque<Student> studentArrayDeque = new ArrayDeque<>();
        {
            studentArrayDeque.offer(new Student(1001, "Leskov", "Dima", "Vyacheslavovich", LocalDate.of(2003, 5, 16), 5));
            studentArrayDeque.offer(new Student(1002, "Lukin", "Nikita", "Sergeevich", LocalDate.of(2001, 6, 19), 4.3));
            studentArrayDeque.offer(new Student(1003, "Pupkin", "Alexey", "Pupkinovich", LocalDate.of(2004, 11, 20), 3.8));
            studentArrayDeque.offer(new Student(1004, "Anotov", "Anot", "Antonovich", LocalDate.of(2003, 2, 27), 5));
            studentArrayDeque.offer(new Student(1005, "Vyachik", "Sergey", "Sergeevich", LocalDate.of(2001, 1, 11), 3));
        }
        studentArrayDeque.forEach(System.out::println);
        System.out.println("Удалить");
        studentArrayDeque.poll();
        studentArrayDeque.forEach(System.out::println);

    }
}
