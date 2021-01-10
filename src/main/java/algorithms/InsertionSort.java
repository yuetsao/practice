package algorithms;

import java.util.Arrays;

/**
 * algorithms2.1
 */
public class InsertionSort {
    static Integer[] sortArr = {5, 2, 4, 6, 1, 3};
    public static void main(String[] args) {
        for (int j = 1; j < sortArr.length; j++) {
            int key = sortArr[j];
            int i = j - 1;
            while (i >= 0 && key < sortArr[i]) {
                sortArr[i + 1] = sortArr[i];
                i--;
            }
            sortArr[i + 1] = key;
        }
        Arrays.asList(sortArr).stream().forEach(e->System.out.println(e));
    }
}
