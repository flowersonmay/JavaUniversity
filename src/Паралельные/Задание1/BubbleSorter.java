package Паралельные.Задание1;

public class BubbleSorter extends Sorter {
    public BubbleSorter(int[] array) {
        super(array, "Сортировка пузырьком");
    }

    public void sort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов, если текущий элемент больше следующего
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps++;
                }
                comparisons++;
            }
        }
    }
}