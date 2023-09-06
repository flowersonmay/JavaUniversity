package Задание1.Пункт1;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("John", 101, 12000);
        programmer.setProgrammingLanguages(new String[]{"Java", "Python", "C++"});

        Designer designer = new Designer("Alice", 102, 15000, "Photoshop");

        System.out.println(programmer.getDetails());
        System.out.println("Programming Languages: " + String.join(", ", programmer.getProgrammingLanguages()));

        System.out.println(designer.getDetails());
    }
}
