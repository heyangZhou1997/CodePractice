public class Problem_LeetCode1464 {
    public static void main(String[] args) {

    }
}

class Solution_LeetCode1464 {
    public int maxProduct(int[] nums) {
        int maxValue = nums[0];
        int subMaxValue = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= maxValue) {
                subMaxValue = maxValue;
                maxValue = nums[i];
            } else if (nums[i] > subMaxValue) {
                subMaxValue = nums[i];
            }
        }
        return (maxValue - 1) * (subMaxValue - 1);
    }
}
