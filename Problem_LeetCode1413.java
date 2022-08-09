public class Problem_LeetCode1413 {
    public static void main(String[] args) {
        Solution_LeetCode1413 sol = new Solution_LeetCode1413();
        System.out.println(sol.minStartValue(new int[] {-3,2,-3,4,2}));
    }
}

class Solution_LeetCode1413 {
    public int minStartValue(int[] nums) {
        int curSum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int num : nums) {
            curSum += num;
            minSum = Math.min(curSum, minSum);
        }
        return minSum > 0 ? 1 : 1 - minSum;
    }
}
