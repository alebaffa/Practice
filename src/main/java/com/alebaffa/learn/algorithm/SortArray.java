
public class SortArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(a, k);
        show(a);

        System.out.println("\n");

        int[] b = {1, 2, 3, 4, 5, 6, 7};
        rotateEfficient(b, k);
        show(b);
    }

    private static void rotateEfficient(int[] b, int k) {
        int size = b.length - k;

        reverse(b, 0, size - 1);
        reverse(b, size, b.length - 1);
        reverse(b, 0, b.length - 1);
    }

    private static void reverse(int[] b, int left, int right) {
        while (left < right) {
            int temp = b[left];
            b[left] = b[right];
            b[right] = temp;
            left++;
            right--;
        }
    }

    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    private static void rotate(int[] a, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = a.length - 1; j > 0; j--) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;

            }
        }
    }
}
