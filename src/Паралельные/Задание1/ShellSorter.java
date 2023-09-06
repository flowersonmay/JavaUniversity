package Паралельные.Задание1;

public class ShellSorter extends Sorter {
    public ShellSorter(int[] array) {
        super(array, "Сортировка Шелла");
    }

    public void sort() {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                    comparisons++;
                    swaps++;
                }
                array[j] = temp;
            }
        }
    }
}
