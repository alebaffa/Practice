import java.util.Arrays;

/**
 * Created by alebaffa on 04/12/16.
 */
public class FindUnpairElement {

    public static void main(String[] args) {
        int[] A = {1, 1, 2, 2, 3, 3, 4};

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        System.out.println(result);
    }
}
