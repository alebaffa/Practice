package learn.algorithm;

/**
 * Created by abaffa on 06/12/2016.
 */
public class MinAverage {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        System.out.println(check(A));
    }

    private static int check(int[] A) {

        double min = (A[0] + A[1]) / 2.0;
        int length = A.length;
        int pos = 0;

        for (int i = 0; i < A.length - 2; i++) {
            // check average of 2 elem
            if ((A[i] + A[i + 1]) / 2.0 < min) {
                min = (A[i] + A[i + 1]) / 2.0;
                pos = i;
            }
            // check average of 3 elem
            if ((A[i] + A[i + 1] + A[i + 2]) / 3.0 < min) {
                min = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
                pos = i;
            }
        }

        if ((A[length - 1] + A[length - 2]) / 2.0 < min) {
            min = (A[length - 1] + A[length - 2]) / 2.0;
            pos = length - 1;
        }

        return pos;
    }
}