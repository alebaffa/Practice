/**
 * Given an array of n integers, find the 3 elements such that
 * a[i] < a[j] < a[k] and i < j < k in 0(n) time. If there are multiple such triplets,
 * then print any one of them.
 * <p>
 * Examples:
 * <p>
 * Input:  arr[] = {12, 11, 10, 5, 6, 2, 30}
 * Output: 5, 6, 30
 * <p>
 * Input:  arr[] = {1, 2, 3, 4}
 * Output: 1, 2, 3 OR 1, 2, 4 OR 2, 3, 4
 * <p>
 * Input:  arr[] = {4, 3, 2, 1}
 * Output: No such triplet
 * <p>
 * Source geeksforgeeks:
 * http://www.geeksforgeeks.org/find-a-sorted-subsequence-of-size-3-in-linear-time/
 */
public class FindSortedsubsquence {
    public static void main(String[] args) {
        int[] arr = {12, 11, 10, 5, 6, 2, 30};

        int[] smaller = new int[arr.length];
        int[] bigger = new int[arr.length];
        int min = 0;
        int max = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[min]){
                min = i;
                smaller[i] = -1;
            } else {
                smaller[i] = min;
            }
        }

        for (int i = arr.length -1; i >= 0 ; i--) {
            if (arr[i] >= arr[max]){
                max = i;
                bigger[i] = -1;
            } else {
                bigger[i] = max;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (smaller[i] != -1 && bigger[i] != -1)
                System.out.println(arr[smaller[i]] + " " + arr[i] + " " + arr[bigger[i]]);
        }

    }
}
