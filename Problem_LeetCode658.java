import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem_LeetCode658 {
    public static void main(String[] args) {
        Solution_LeetCode658 sol = new Solution_LeetCode658();
        int[] arr = new int[] {1,2,3,4,5};
        List<Integer> result = sol.findClosestElements(arr, 4, 3);
        Utils.print(result);
    }
}

class Solution_LeetCode658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (k == arr.length) {
            return Arrays.stream(arr).boxed().collect(Collectors.toList());
        }
        int left = binarySearch(arr, 0, arr.length - 1, x);
        int right = left + 1;
        if (left == arr.length - 1) {
            left--;
            right--;
        }
        while (right - left - 1 < k) {
            if (right == arr.length) {
                left--;
                continue;
            } else if (left == -1) {
                right++;
                continue;
            }
            if (Math.abs(arr[right] - x) < Math.abs(x - arr[left])) {
                right++;
            } else {
                left--;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = left + 1; i < right; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    private int binarySearch(int[] arr, int start, int end, int target) {
        if (start == end) {
            return start;
        }
        int mid = start + (end - start) / 2;
        if (target > arr[mid]) {
            start = mid + 1;
        } else {
            end = mid;
        }
        return binarySearch(arr, start, end, target);
    }
}