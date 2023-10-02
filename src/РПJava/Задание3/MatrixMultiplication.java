package РПJava.Задание3;
import java.util.Random;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер матрицы: ");
        int size = scanner.nextInt();

        int[][] matrix1 = generateRandomMatrix(size);
        int[][] matrix2 = generateRandomMatrix(size);

        System.out.println("Матрица 1:");
        printMatrix(matrix1, size);

        System.out.println("Матрица 2:");
        printMatrix(matrix2, size);

        int[][] result = multiplyParallel(matrix1, matrix2);

        System.out.println("Результат умножения:");
        printMatrix(result, size);
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

    public static int[][] multiplyParallel(int[][] matrix1, int[][] matrix2) {
        int size = matrix1.length;
        int[][] result = new int[size][size];

        Thread[] threads = new Thread[size * size];

        int threadIndex = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                final int row = i;
                final int col = j;

                threads[threadIndex] = new Thread(() -> {
                    int sum = 0;
                    for (int k = 0; k < size; k++) {
                        sum += matrix1[row][k] * matrix2[k][col];
                    }
                    result[row][col] = sum;
                });

                threads[threadIndex].start();
                threadIndex++;
            }
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
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}