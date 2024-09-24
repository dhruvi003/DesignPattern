import behavioral.BubbleSort;
import behavioral.QuickSort;
import behavioral.SortContext;

public class Main {
    public static void main(String[] args) {
        SortContext sortContext = new SortContext();

        int[] array = {64, 25, 12, 22, 11};

        // Using Bubble Sort Strategy
        sortContext.setSortingStrategy(new BubbleSort());
        sortContext.sortArray(array.clone());

        // Using Quick Sort Strategy
        sortContext.setSortingStrategy(new QuickSort());
        sortContext.sortArray(array.clone());
    }
}
