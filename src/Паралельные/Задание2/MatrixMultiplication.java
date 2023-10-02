package Паралельные.Задание2;
import java.util.Random;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер матрицы: ");
        int size = scanner.nextInt();

        int[][] matrix1 = generateRandomMatrix(size);
        int[][] matrix2 = generateRandomMatrix(size);

        System.out.println("Выберите способ умножения (1 - последовательно, 2 - параллельно): ");
        int method = scanner.nextInt();

        if (method == 1) {
            long startTime = System.currentTimeMillis();
            int[][] result = multiplySequential(matrix1, matrix2);
            long endTime = System.currentTimeMillis();

            System.out.println("Результат умножения:");
            printMatrix(result, size);

            System.out.println("Время выполнения (последовательно): " + (endTime - startTime) + " мс");
        } else if (method == 2) {
            long startTime = System.currentTimeMillis();
            int[][] result = multiplyParallel(matrix1, matrix2);
            long endTime = System.currentTimeMillis();

            System.out.println("Результат умножения:");
            printMatrix(result, size);

            System.out.println("Время выполнения (параллельно): " + (endTime - startTime) + " мс");
        } else {
            System.out.println("Некорректный выбор способа умножения.");
        }
    }

    public static int[][] generateRandomMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        return matrix;
    }

    public static int[][] multiplySequential(int[][] matrix1, int[][] matrix2) {
        int size = matrix1.length;
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] multiplyParallel(int[][] matrix1, int[][] matrix2) {
        int size = matrix1.length;
        int[][] result = new int[size][size];

        Thread[] threads = new Thread[size];

        for (int i = 0; i < size; i++) {
            final int row = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < size; j++) {
                    for (int k = 0; k < size; k++) {
                        result[row][j] += matrix1[row][k] * matrix2[k][j];
                    }
                }
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix, int size) {
        if (size <= 5) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}