/**
 * Created by abaffa on 30/11/2016.
 */
public class Palindrome {
    public static void main(String[] args) {
        String text = "167";

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != text.charAt(text.length() -1 -i)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
