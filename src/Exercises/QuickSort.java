package Exercises;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[] {1, 9, 1112, 8, 12, 0, -13, 2390, 73, 191, 7, 6, 5, 4, 3};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
public static void quickSort(int[] array, int low, int high) {
    if (array.length == 0 || low >= high) return;

    int middle = array[low + (high - low) / 2];

    int i = low, j = high;
    while (i <= j) {
        while (array[i] < middle) i++;

        while (array[j] > middle) j--;

        if (i <= j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    if (low < j) quickSort(array, low, j);

    if (high > i) quickSort(array, i, high);
}
}
