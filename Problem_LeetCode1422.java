public class Problem_LeetCode1422 {
    public static void main(String[] args) {
        Solution_LeetCode1422 sol = new Solution_LeetCode1422();
        System.out.println(sol.maxScore("011101"));
    }
}

class Solution_LeetCode1422 {
    public int maxScore(String s) {
        int len = s.length();
        int[] zeroNums = new int[len];
        zeroNums[0] = s.charAt(0) == '0' ? 1 : 0;
        for (int i = 1; i < len; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                zeroNums[i] = zeroNums[i - 1] + 1;
            } else {
                zeroNums[i] = zeroNums[i - 1];
            }
        }
        int maxScore = 0;
        for (int i = 0; i < len - 1; i++) {
            maxScore = Math.max(maxScore, 2 * zeroNums[i] + len - i - 1 - zeroNums[len - 1]);
        }
        return maxScore;
    }
}
