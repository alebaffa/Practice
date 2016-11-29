
public class GFG_1 {
    public static void main(String[] args){
        int[] a = {0, 2, 1, 2, 0};
        sortArray(a);
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    private static void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
    }
}
