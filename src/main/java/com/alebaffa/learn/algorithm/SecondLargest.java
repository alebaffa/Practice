/**
 * Created by abaffa on 30/11/2016.
 */
public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {4, 6, 3, 10, 8, 2, 90};
        int k = 2;
        System.out.println(searchKLargest(a, k));
    }

    private static int searchKLargest(int[] a, int k) {
        a = quicksort(a, 0, a.length - 1);
        return a[a.length - k];
    }

    private static int[] quicksort(int[] a, int low, int high) {
        int i = low, j = high;
        int middle = low + (high - low) / 2;
        int pivot = a[middle];

        while (i <= j) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(a, low, j);
        if (high > i)
            quicksort(a, i, high);

        return a;
    }
}
