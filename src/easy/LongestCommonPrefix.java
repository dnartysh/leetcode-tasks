package easy;

public class LongestCommonPrefix {
    StringBuilder sb = new StringBuilder();

    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(i) != 0) {
                result = result.substring(0, result.length() - 1);
            }
        }

        return result;
    }
}

//      flower flow flight
//      dog racecar car