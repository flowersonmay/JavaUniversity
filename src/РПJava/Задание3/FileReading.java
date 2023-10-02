package РПJava.Задание3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    private static final String FILE_PATH = "E:\\Dubna State Univeristy\\7й семестр\\РП Java Дидоренко\\DevOpsOnJava\\src\\РПJava\\Задание3\\file.txt";

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Thread 1: " + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Thread 2: " + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
