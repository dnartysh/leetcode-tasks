package easy;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
                sum += values.get(s.charAt(i + 1)) - values.get(s.charAt(i));
                i++;
            } else {
                sum += values.get(s.charAt(i));
            }
        }

        return sum;
    }
}
