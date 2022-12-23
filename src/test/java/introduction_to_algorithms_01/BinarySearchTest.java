package introduction_to_algorithms_01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
    private int[] list;

    @Before
    public void init() {
        list = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    }

    @Test
    public void testSearch4() {
        int result = BinarySearch.search(list, 4);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSearch3() {
        int result = BinarySearch.search(list, 3);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSearchNonExistingNum() {
        int result = BinarySearch.search(list, 666);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testSearchRecursively4() {
        int result = BinarySearch.searchRecursively(list, 4, 0, list.length);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSearchRecursively10() {
        int result = BinarySearch.searchRecursively(list, 10, 0, list.length);
        Assert.assertEquals(9, result);
    }

    @Test
    public void testSearchRecursivelyFromAndToBiggerRange() {
        int result = BinarySearch.searchRecursively(list, 1, -100, 100);
        Assert.assertEquals(0, result);
    }
}
