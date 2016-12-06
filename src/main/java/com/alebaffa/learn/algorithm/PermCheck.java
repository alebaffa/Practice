package learn.algorithm;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by abaffa on 05/12/2016.
 */
public class PermCheck {
    public static void main(String[] args){
        int[] A = {4, 1, 3, 2};
        int[] B = {1, 2, 3, 4};

        System.out.println(isPerm(A));
        System.out.println(isPerm(B));
    }

    private static int isPerm(int[] A) {
        int min = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] == min) min++;
        }
        if (min == A.length + 1) return 1;
        return 0;
    }
}
