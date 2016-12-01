import java.util.Arrays;

/**
 * Created by abaffa on 01/12/2016.
 */
public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] a = {0, 2, 1, 2, 0};
        sort(a, 0, a.length-1);
    }

    private static void sort(int[] a, int low, int high) {
        int i = low, j = high;
        int middle = low + (high - low) / 2;
        int pivot = a[middle];

        while (i <= j) {
            if (a[i] <= pivot) i++;
            if (a[j] >= pivot) j--;
            if (i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                i--;
            }
        }

        if (low < j)
            sort(a, low, j);
        if (high > i)
            sort(a, i, high);
    }
}
