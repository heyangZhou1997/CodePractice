import java.util.HashMap;
import java.util.Map;

public class Problem_LeetCode1 {
    public static void main(String[] args) {
        Solution_LeetCode1 sol = new Solution_LeetCode1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}

class Solution_LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                return new int[] {i, map.get(num)};
            }
            map.put(target - num, i);
        }
        return new int[] {};
    }
}