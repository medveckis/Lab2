package solution;

/**
 * @author Maksims Medveckis 171RDB030 3.kurs 1.grupa
 */
public class Solution {

    public static void main(String[] args) {
        String palindrome1 = "abcba";
        String palindrome2 = "argentinamanitnegra";
        String palindrome3 = "Sapalsarītadēdatīraslapas";
        String s1 = "abccb";
        String s2 = "stirna";

        System.out.println(palindrome(palindrome1)); // true
        System.out.println(palindrome(palindrome2)); // true
        System.out.println(palindrome(palindrome3)); // true
        System.out.println(palindrome(s1)); // false
        System.out.println(palindrome(s2)); // false
    }

    private static boolean palindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (!Character.toString(s.charAt(0)).equalsIgnoreCase(Character.toString(s.charAt(s.length() - 1)))) {
            return false;
        }
        return palindrome(s.substring(1, s.length() - 1));
    }
}
