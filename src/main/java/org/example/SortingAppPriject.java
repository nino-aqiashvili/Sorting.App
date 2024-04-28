package org.example;

import java.util.Arrays;
import java.util.TooManyListenersException;

public class SortingAppPriject {

    public void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException();
        } else if ( array.length==0) {
            throw new IllegalArgumentException();
        } else if (array.length > 10){
            throw new IllegalArgumentException();
        }
        else Arrays.sort(array);
    }
}

