public class MergeSort {

    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)               a[k] = aux[j++];
            else if (j > hi)                a[k] = aux[i++];
            else if (aux[j] < aux[i])       a[k] = aux[j++];
            else                            a[k] = aux[i++];
        }
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;

        int[] aux = new int[a.length];

        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 4, 5, 8, 3, 2};
        sort(a, 0, a.length-1);
        show(a);
    }
}