package introduction_to_algorithms_01;

public class BinarySearch {
    public static int search(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int currentIndex = (low + high) / 2;
            int currentItem = list[currentIndex];
            if (currentItem == item) {
                return currentIndex;
            } else if (currentItem < item) {
                low = currentIndex + 1;
            } else {
                high = currentIndex - 1;
            }
        }
        return -1;
    }

    public static int searchRecursively(int[] list, int item, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > list.length) {
            to = list.length;
        }
        if (from > to) {
            return -1;
        }

        int currentIndex = (from + to) / 2;
        int currentItem = list[currentIndex];
        if (currentItem == item) {
            return currentIndex;
        } else if (currentItem < item) {
            return searchRecursively(list, item, currentIndex + 1, to);
        } else {
            return searchRecursively(list, item, from, currentIndex - 1);
        }
    }
}
