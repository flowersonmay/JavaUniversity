package РПJava.Задание2;

import java.time.LocalDate;
import java.util.*;

public class Functions {

    public static ArrayList<Student> getArrayStudents(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1001, "Leskov", "Dima", "Vyacheslavovich", LocalDate.of(2003, 5, 16), 5));
        students.add(new Student(1002, "Lukin", "Nikita", "Sergeevich", LocalDate.of(2001, 6, 19), 4.3));
        students.add(new Student(1003, "Pupkin", "Alexey", "Pupkinovich", LocalDate.of(2004, 11, 20), 3.8));
        students.add(new Student(1004, "Anotov", "Anot", "Antonovich", LocalDate.of(2003, 2, 27), 5));
        students.add(new Student(1005, "Vyachik", "Sergey", "Sergeevich", LocalDate.of(2001, 1, 11), 3));
        return  students;
    }
    public static HashMap<String,Double> deleteLess3(HashMap<String,Double> hashMap){
        HashMap<String,Double> newHashMap = new HashMap<>();
        Set<Map.Entry<String, Double>> entrySet = hashMap.entrySet();
        for (Map.Entry<String,Double> entry : entrySet){
            if (entry.getValue() >= 3) {
                newHashMap.put(entry.getKey(),entry.getValue());
                System.out.println("студент переведен на следующий курс :" + entry.getKey() + " " + entry.getValue() );
                System.out.println();
                System.out.println("-");
            }
        }
        return newHashMap;
    }

}
