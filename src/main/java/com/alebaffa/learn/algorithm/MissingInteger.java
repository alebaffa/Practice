package learn.algorithm;

import java.util.*;

public class MissingInteger {
    public static void main(String[] args) {
        int[] A = {1, 1, 2, 3, 5, 6};
        System.out.println(check(A));
    }

    private static int check(int[] A) {

        Arrays.sort(A);
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0)
                map.put(A[i], true);
        }

        for (int i = 1; i < A.length+1; i++) {
            if (map.get(i) == null) return i;
        }

        return 0;
    }
}
