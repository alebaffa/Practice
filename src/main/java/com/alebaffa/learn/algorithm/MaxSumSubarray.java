package learn.algorithm;

/**
 * Created by abaffa on 06/12/2016.
 */
public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] A = {2, -1, 2, 3, 4, -5};
        System.out.println(maxSum(A));
    }

    private static int maxSum(int[] A) {
        int maxTemp = A[0];
        int maxFinal = A[0];

        for (int i = 1; i < A.length; i++) {
            maxTemp = Math.max(A[i], A[i] + maxTemp);
            maxFinal = Math.max(maxFinal, maxTemp);
        }
        return maxFinal;
    }
}
