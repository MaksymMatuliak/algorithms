package quicksort_05;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class QuicksortTest {
    @Test
    public void testSort() {
        List<Integer> unsortedList = List.of(3, 4, 1, 5);
        List<Integer> sortedList = List.of(1, 3, 4, 5);
        List<Integer> result = Quicksort.sort(unsortedList);
        for (int i = 0; i < sortedList.size(); i++) {
            Assert.assertEquals("Element is not sorted at index " + i, sortedList.get(i), result.get(i));
        }
    }
}
