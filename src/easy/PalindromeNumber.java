package easy;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();

        return String.valueOf(x).equals(sb.toString());
    }
}
