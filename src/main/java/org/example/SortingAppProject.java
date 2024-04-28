package org.example;

import java.util.Arrays;

public class SortingAppProject {

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

