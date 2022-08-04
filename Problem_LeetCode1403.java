import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_LeetCode1403 {
    public static void main(String[] args) {
        Solution_LeetCode1403 sol = new Solution_LeetCode1403();
    }
}

class Solution_LeetCode1403 {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int newSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            newSum += nums[i];
            result.add(nums[i]);
            if (2 * newSum > sum) {
                return result;
            }
        }
        return result;
    }
}
