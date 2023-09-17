package РПJava.Задание2.Пункт3;

import РПJava.Задание2.Functions;
import РПJava.Задание2.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Hash {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = Functions.getArrayStudents();
        HashMap<String, Double> hashMap;


        hashMap = (HashMap<String, Double>)
                studentArrayList.stream()
                .filter(s -> s.getAvgRateJava() >= 3)
                .collect(Collectors.toMap(Student::getFullName, Student::getAvgRateJava));

        System.out.println("Перебор");
        hashMap.forEach((k, v) -> System.out.println(k + " | " + v));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Удалить всех меньше 3");
        hashMap = Functions.deleteLess3(hashMap);
        hashMap.forEach((k, v) -> System.out.println(k + " | " + v));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Анализ текста");
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Map<Character, Integer> countChar = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char tmp = string.charAt(i);
            if (countChar.containsKey(tmp)) {
                countChar.replace(tmp, countChar.get(tmp) + 1);
            } else countChar.put(tmp, 1);
        }
        System.out.println("Сортировка по ключу");
        countChar.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Сортировка по значению");

        countChar.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");


    }
}
