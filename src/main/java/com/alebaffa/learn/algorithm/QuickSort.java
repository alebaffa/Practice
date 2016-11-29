
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {3, 4, 1, 2, 9, 8, 22, 80, 55};
        sort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void sort(int[] a, int low, int high) {
        if (high <= low) return;
        int pivot = partition(a, low, high);
        sort(a, low, pivot - 1);
        sort(a, pivot + 1, high);
    }

    private static int partition(int[] a, int low, int high) {
        int i = low, j = high + 1;
        int v = a[low];

        while(true){
            while(a[++i] < v)   if (i == high) break;
            while (a[--j] > v)  if (j == low) break;
            if (j <= i)         break;

            exch(a, i, j);
        }
        exch(a, low, j);

        return j;
    }

    private static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
