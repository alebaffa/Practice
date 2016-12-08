package learn.algorithm;

import java.util.Arrays;

/**
 * Created by abaffa on 07/12/2016.
 */
public class MaxProduct {
    public static void main(String[] args) {
        int[] A = {-3, 1, 2, -2, 5,6 };
        System.out.println(maxProduct(A));
    }

    private static int maxProduct(int[] A) {
        Arrays.sort(A);
        int length = A.length;
        int sum1 = A[length -1] * A[length -2] * A[length -3];
        int sum2 = A[0] * A[1] * A[length - 1];
        return sum1 > sum2 ? sum1:sum2;
    }
}
