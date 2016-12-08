package learn.algorithm;

import java.util.Arrays;

/**
 * Created by abaffa on 07/12/2016.
 */
public class Triangle {
    public static void main(String[] args) {
        int[] A = {10, 2, 5, 1, 8, 20};
        System.out.println(triangle(A));
    }

    private static int triangle(int[] A) {
        int length = A.length;
        Arrays.sort(A);
        for (int i = 0; i < length - 2; i++) {
            if (A[i] + A[i + 1] > A[i + 2])
                return 1;
        }
        return 0;
    }
}
