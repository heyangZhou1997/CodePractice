import java.util.*;

public class Problem_LeetCode636 {
    public static void main(String[] args) {
        Solution_LeetCode636 sol = new Solution_LeetCode636();
        List<String> logs = Arrays.asList("0:start:0","0:start:1","0:start:2","0:end:3","0:end:4","0:end:5");
        int[] result = sol.exclusiveTime(1, logs);
        Utils.print(result);
    }
}

class Solution_LeetCode636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Deque<Integer> exclusiveTimes = new LinkedList<>();
        Deque<Integer> timesRecords = new LinkedList<>();
        logs.forEach(s -> {
            String[] split = s.split(":");
            int functionId = Integer.parseInt(split[0]);
            int time = Integer.parseInt(split[2]);
            if (split[1].equals("start")) {
                exclusiveTimes.push(0);
                timesRecords.push(time);
            } else {
                int excludeTime = exclusiveTimes.pop();
                int startTime = timesRecords.pop();
                int currentTime = time - startTime + 1 - excludeTime;
                result[functionId] += currentTime;
                if (!exclusiveTimes.isEmpty()) {
                    exclusiveTimes.push(exclusiveTimes.pop() + currentTime + excludeTime);
                }
            }
        });
        return result;
    }
}