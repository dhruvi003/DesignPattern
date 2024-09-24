package behavioral;

import utils.Logger;

import java.util.logging.Level;

public class SortContext {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
        Logger.log(Level.INFO, "Strategy set to: " + sortingStrategy.getClass().getSimpleName());
    }

    public void sortArray(int[] array) {
        if (sortingStrategy == null) {
            Logger.log(Level.SEVERE, "Sorting strategy not set!");
            throw new IllegalStateException("Sorting strategy is not set.");
        }
        sortingStrategy.sort(array);
    }
}
