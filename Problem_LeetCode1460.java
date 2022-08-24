import java.util.HashMap;
import java.util.Map;

public class Problem_LeetCode1460 {
    public static void main(String[] args) {

    }
}

class Solution_LeetCode1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> arrCount = new HashMap<>();
        for (int num : arr) {
            arrCount.put(num, arrCount.getOrDefault(num, 0) + 1);
        }
        for (int num : target) {
            if (!arrCount.containsKey(num)) {
                return false;
            }
            arrCount.put(num, arrCount.get(num) - 1);
            if (arrCount.get(num) == 0) {
                arrCount.remove(num);
            }
        }
        return true;
    }
}
