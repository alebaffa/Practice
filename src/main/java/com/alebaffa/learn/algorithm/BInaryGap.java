/**
 * Created by alebaffa on 04/12/16.
 */
public class BInaryGap {
    public static void main(String[] args) {
        int N = 1041;

        int current = 0;
        int max = 0;

        while ((N > 0) && (N % 2 == 0)) N /= 2;

        while (N > 0) {
            if (N % 2 == 0) current++;
            else {
                max = Math.max(max, current);
                current = 0;
            }
            N /= 2;
        }
        System.out.println(max);
    }
}
