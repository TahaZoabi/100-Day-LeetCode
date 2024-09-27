package Day_2;

// 1. Two Sum
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length == 2) {
            result[1] = 1;
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
