package Паралельные;

import Паралельные.Задание1.BubbleSorter;
import Паралельные.Задание1.QuickSorter;
import Паралельные.Задание1.ShellSorter;
import Паралельные.Задание1.Sorter;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите количество элементов ");
        int count = scanner.nextInt();
        int[] array1 = generateRandomArray(count);
        int[] array2 = Arrays.copyOf(array1, array1.length);
        int[] array3 = Arrays.copyOf(array1, array1.length);


        Sorter bubbleSorter = new BubbleSorter(array1);
        Sorter shellSorter = new ShellSorter(array2);
        Sorter quickSorter = new QuickSorter(array3);

        System.out.println("____________Сортировка с потоками____________");
        Thread bubbleThread = new Thread(bubbleSorter);
        Thread shellThread = new Thread(shellSorter);
        Thread quickThread = new Thread(quickSorter);


        quickThread.start();
        bubbleThread.start();
        shellThread.start();

        try {
            bubbleThread.join();
            shellThread.join();
            quickThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("____________Сортировка без потока____________");
        quickSorter.run();
        bubbleSorter.run();
        shellSorter.run();
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







