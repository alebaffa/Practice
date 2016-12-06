/**
 * Source: codility
 * https://codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 * <p>
 * A zero-indexed array A consisting of N different integers is given. The array contains
 * integers in the range [1..(N + 1)], which means that exactly one element is missing.
 * <p>
 * Your goal is to find that missing element.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A, returns the value of the missing element.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 */
public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 5, 8, 7, 1};
        int totalSize = A.length + 1;
        int totalSum = 0;
        for (int i = 1; i <= totalSize; i++) {
            totalSum += i;
        }
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            totalSum -= A[i];
        }
        System.out.println(totalSum);
    }
}
