package Паралельные;

import Паралельные.Задание1.BubbleSorter;
import Паралельные.Задание1.QuickSorter;
import Паралельные.Задание1.ShellSorter;
import Паралельные.Задание1.Sorter;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray(100000);

        Sorter bubbleSorter = new BubbleSorter(Arrays.copyOf(array, array.length));
        Sorter shellSorter = new ShellSorter(Arrays.copyOf(array, array.length));
        Sorter quickSorter = new QuickSorter(Arrays.copyOf(array, array.length));

        long startTime = System.currentTimeMillis();

        bubbleSorter.run();
        shellSorter.run();
        quickSorter.run();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Последовательная сортировка завершена. Время: " + elapsedTime + " мс.");
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000);
        }
        return array;
    }
}







