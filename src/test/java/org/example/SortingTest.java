package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SortingTest {
    SortingAppPriject sorting = new SortingAppPriject();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
        sorting.sort(null);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array = new int[]{300};
        sorting.sort(array);
        assertEquals(1, array.length);
    }
    @Test
    public void test1OtherCases() {

        int[] array = new int[]{99, 2, 57, 12, 89, 35, 21, 8,66, 55};

        sorting.sort(array);
        assertEquals(2, array[0]);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testmorethen1OtherCases() {

        int[] array = new int[]{99, 2, 57, 12, 89, 35, 21, 8,66, 55, 62, 88};
        sorting.sort(array);
    }
}

