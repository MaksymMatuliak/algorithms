package selection_sort_02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {
    @Test
    public void testSort() {
        int[] list = new int[]{ 100, 2, 25, 2, 34, 777, 71, 1, -100, 10000 };
        int[] sortedList = new int[]{ -100, 1, 2, 2, 25, 34, 71, 100, 777, 10000 };
        int[] result = SelectionSort.sort(list);
        for (int i = 0; i < list.length; i++) {
            Assert.assertEquals(sortedList[i], result[i]);
        }
    }

    @Test
    public void testSortSameNumbers() {
        int[] list = new int[]{ 0, 0, 0, 0 };
        int[] result = SelectionSort.sort(list);
        for (int i = 0; i < list.length; i++) {
            Assert.assertEquals(0, result[i]);
        }
    }

    @Test
    public void testSortEmpty() {
        int[] emptyList = new int[0];
        int[] result = SelectionSort.sort(emptyList);
        Assert.assertEquals(0, result.length);
    }
}
