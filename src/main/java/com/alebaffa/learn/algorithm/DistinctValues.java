package learn.algorithm;

import java.util.HashSet;

/**
 * Created by abaffa on 07/12/2016.
 */
public class DistinctValues {
    public static void main(String[] args){
        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.println(distinct(A));
    }

    private static int distinct(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }
}
