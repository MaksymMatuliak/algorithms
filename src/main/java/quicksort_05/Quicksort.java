package quicksort_05;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {
    public static List<Integer> sort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        int pivot = list.get(0);
        List<Integer> leftPart = new ArrayList<>();
        List<Integer> rightPart = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < pivot) {
                leftPart.add(list.get(i));
            } else {
                rightPart.add(list.get(i));
            }
        }
        List<Integer> sortedLeft = sort(leftPart);
        sortedLeft.add(pivot);
        sortedLeft.addAll(sort(rightPart));
        return sortedLeft;
    }
}
