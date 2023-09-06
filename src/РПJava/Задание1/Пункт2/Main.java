package РПJava.Задание1.Пункт2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(1,4,5);
        Vector vector1 = new Vector(4,5,6);
        int n = 10;
        System.out.println("Длина вектора  |" + vector.lenghtVector());
        System.out.println("Скалярное произведение  |" + vector.scalarMultyply(vector1));
        System.out.println("Вектотрное произведение  |" + vector.vectorMultyply(vector1));
        System.out.println("Угол между векторами  |" + vector.angleBetweenVectors(vector1));
        System.out.println("Сумма  |" + vector.sum(vector1));
        System.out.println("Разница  |" + vector.minus(vector1));
        System.out.println("Генерация :" + n + " векторов");
        Vector[] vectors = Vector.generateRandomVectors(20);

        Arrays.stream(vectors).forEach(System.out::println);
    }
}
