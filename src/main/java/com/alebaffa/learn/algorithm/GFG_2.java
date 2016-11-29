import java.util.HashMap;
import java.util.Map;

public class GFG_2 {
    public static void main(String[] args) {
        String word = "hello";
        String output = find(word);
        System.out.println(output);
    }

    private static String find(String word) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String letter = String.valueOf(word.charAt(i));

            if (!map.containsKey(letter))
                map.put(letter, 1);
            else
                map.put(letter, map.get(letter) + 1);
        }
        for (int i = 0; i < word.length(); i++) {
            String letter = String.valueOf(word.charAt(i));
            if (map.get(letter) == 1)
                return letter;
        }
        return null;
    }
}
