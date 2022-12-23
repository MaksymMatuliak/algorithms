package selection_sort_02;

public class SelectionSort {
    public static int[] sort(int[] numbers) {
        int[] result = new int[numbers.length];
        boolean[] isTaken = new boolean[numbers.length];
        for (int k = 0; k < numbers.length; k++) {
            int currentSmallestNum = -1;
            for (int i = 0; i < numbers.length; i++) {
                if (!isTaken[i]) {
                    currentSmallestNum = numbers[i];
                }
            }
            int currentSmallestNumIndex = k;
            for (int i = 0; i < numbers.length; i++) {
                if (!isTaken[i] && numbers[i] < currentSmallestNum) {
                    currentSmallestNum = numbers[i];
                    currentSmallestNumIndex = i;
                }
            }
            isTaken[currentSmallestNumIndex] = true;
            result[k] = currentSmallestNum;
        }
        return result;
    }
}
