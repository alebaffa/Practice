package learn.algorithm;

import java.util.Arrays;

/**
 * Created by abaffa on 06/12/2016.
 */
public class MaxCounters {
    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        int[] counters = new int[N];

        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                counters[A[i] - 1]++;
                if (counters[A[i] - 1] > max)
                    max = counters[A[i] - 1];
            }

            if (A[i] > N) {
                Arrays.fill(counters, max);
            }
        }
        for (int i = 0; i < N ; i++) {
            System.out.println(counters[i]);
        }
    }

}
