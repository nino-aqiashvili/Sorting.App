package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
public class SortingApp {
    private static final Logger logger = LogManager.getLogger(SortingApp.class);

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 3};
        SortingApp sortingApp = new SortingApp();
        sortingApp.sort(array);
        logger.info("Sorted array: {}", Arrays.toString(array));
    }
    public void sort(int[] array) {
        if (array == null) {
            logger.error("Input array is null");
            throw new IllegalArgumentException("Input array is null");
        } else if (array.length == 0) {
            logger.error("Input array is empty");
            throw new IllegalArgumentException("Input array is empty");
        } else if (array.length > 10) {
            logger.error("Input array has more than 10 elements");
            throw new IllegalArgumentException("Input array has more than 10 elements");
        } else {
            Arrays.sort(array);
            logger.info("Array sorted successfully");
        }
    }
}
