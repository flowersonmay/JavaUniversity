package Паралельные.Задание1;

public class Sorter implements Runnable {
    protected int[] array;
    protected String name;
    protected long comparisons;
    protected long swaps;

    public Sorter(int[] array, String name) {
        this.array = array;
        this.name = name;
        comparisons = 0;
        swaps = 0;
    }

    public void run() {
        long startTime = System.currentTimeMillis();
        sort();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(name + "  завершена. Сравнений: " + comparisons + ", Перестановок: " + swaps + ", Время: " + elapsedTime + " мс.");
    }

    public void sort() {
        // Реализация сортировки в потомках
    }

}
