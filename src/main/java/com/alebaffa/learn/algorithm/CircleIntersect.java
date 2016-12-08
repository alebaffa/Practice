package learn.algorithm;

import java.util.*;

/**
 * Created by abaffa on 07/12/2016.
 */
public class CircleIntersect {
    public static void main(String[] args){
        int[] A = {1, 5, 2, 1, 4, 0};
        System.out.println(intersects(A));
    }

    private static int intersects(int[] A) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(A);
        for (int i = 0; i < A.length -1; i++) {
            System.out.println("C1: " + i + ", C2: " + (i+1));
            int squareOfSumCenters = (i - (i+1))*(i - (i+1));
            int squareOfSumOfRays = (A[i] * A[i+1]) * (A[i] * A[i+1]);

            if(squareOfSumCenters <= squareOfSumOfRays){
                System.out.println("containts");
            }
        }
        return list.size();
    }

}
