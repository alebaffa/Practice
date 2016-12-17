package learn.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abaffa on 08/12/2016.
 */
public class NumPermutation {
    private static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        permutation("", String.valueOf(123));
        System.out.println(list.size());

    }

    public static void permutation(String start, String end) {
        if (end.length() <= 1) {
            if (!list.contains(start + end))
                list.add(start + end);
        } else {
            for (int i = 0; i < end.length(); i++) {
                String substringEnd = end.substring(0, i) + end.substring(i + 1);
                String substringStart = start + end.charAt(i);

                permutation(substringStart, substringEnd);
            }
        }
    }
}

