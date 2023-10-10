package РПJava.Задание3;

import java.util.Arrays;

public class ArraySum {
    private static final int THREAD_COUNT = 4;
    private static final int ARRAY_SIZE = 100000;
    private static final int[] array = new int[ARRAY_SIZE];
    private static final int[] partialSums = new int[THREAD_COUNT];
    private static final int INTERVAL = ARRAY_SIZE / THREAD_COUNT;
    private static int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        // Создаем и запускаем потоки
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> {
                int start = finalI * INTERVAL;
                int end = (finalI + 1) * INTERVAL;
                for (int j = start; j < end; j++) {
                    partialSums[finalI] += array[j];
                }
                System.out.println();
            });
            threads[i].start();
        }

        //завершения всех потоков
        for (Thread thread : threads) {
            thread.join();
        }

        // Суммируем частичные суммы
        for (int partialSum : partialSums) {
            sum += partialSum;
        }
        System.out.println("Частичные суммы: " + Arrays.toString(partialSums));
        System.out.println("Общая сумма: " + sum);
    }
}