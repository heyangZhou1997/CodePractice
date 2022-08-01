public class Problem_LeetCode1374 {
    public static void main(String[] args) {
        Solution_LeetCode1374 sol = new Solution_LeetCode1374();
        System.out.println(sol.generateTheString(8));
    }
}

class Solution_LeetCode1374 {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 1) {
            return sb.append("a".repeat(n)).toString();
        } else {
            return sb.append("a".repeat(n - 1)).append("b").toString();
        }
    }
}
