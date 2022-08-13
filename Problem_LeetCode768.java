import java.util.Deque;
import java.util.LinkedList;

public class Problem_LeetCode768 {
    public static void main(String[] args) {
        Solution_LeetCode768 sol = new Solution_LeetCode768();
        int[] arr = new int[] {5,1,1,8,1,6,5,9,7,8};
        System.out.println(sol.maxChunksToSorted(arr));
    }
}

class Solution_LeetCode768 {
    public int maxChunksToSorted(int[] arr) {
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (queue.isEmpty() || arr[i] >= queue.peek()) {
                queue.push(arr[i]);
            } else {
                int maxValue = queue.peek();
                while (!queue.isEmpty() && arr[i] < queue.peek()) {
                    queue.pop();
                }
                queue.push(maxValue);
            }
        }
        return queue.size();
    }
}
