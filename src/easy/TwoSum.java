package easy;

public class TwoSum {
    public static int[] find(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int second = nums[j];

                if (first + second == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
