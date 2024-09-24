package behavioral;

import utils.Logger;

import java.util.Arrays;
import java.util.logging.Level;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        Logger.log(Level.INFO, "Performing Bubble Sort on: " + Arrays.toString(array));
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        Logger.log(Level.INFO, "Sorted Array: " + Arrays.toString(array));
    }
}
