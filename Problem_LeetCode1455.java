public class Problem_LeetCode1455 {
    public static void main(String[] args) {
        Solution_LeetCode1455 sol = new Solution_LeetCode1455();
        System.out.println(sol.isPrefixOfWord("i love eating burger", "burg"));
    }
}

class Solution_LeetCode1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < searchWord.length()) {
                continue;
            }
            int j = 0;
            for (; j < searchWord.length(); j++) {
                if (words[i].charAt(j) != searchWord.charAt(j)) {
                    break;
                }
            }
            if (j == searchWord.length()) {
                return i + 1;
            }
            continue;
        }
        return -1;
    }
}