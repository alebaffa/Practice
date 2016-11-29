import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        int[] sorted = sort(array);
        Arrays.stream(sorted).forEach(System.out::println);
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j-1]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
        return array;
    }
}
