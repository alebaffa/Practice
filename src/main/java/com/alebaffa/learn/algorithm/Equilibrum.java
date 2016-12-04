
public class Equilibrum {
    public static void main(String[] args) {
        int[] A = {-2, 1, 4, 7, 4, 8, 3, 6, 4, 8};
        System.out.println(equilibrium(A));
    }

    private static int equilibrium(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ((sum(a, 0, i - 1) == sum(a, i + 1, a.length - 1)))
                return i;
        }
        return -1;
    }

    private static int sum(int[] a, int low, int high) {
        int sum = 0;
        for (int j = low; j <= high; j++) {
            sum += a[j];
        }
        return sum;
    }
}
