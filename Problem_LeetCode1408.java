import java.util.ArrayList;
import java.util.List;

public class Problem_LeetCode1408 {
    public static void main(String[] args) {
        Solution_LeetCode1408 sol = new Solution_LeetCode1408();
        String[] words = new String[] {"mass","as","hero","superhero"};
        List<String> result = sol.stringMatching(words);
        Utils.print(result);
    }
}

class Solution_LeetCode1408 {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }
}
