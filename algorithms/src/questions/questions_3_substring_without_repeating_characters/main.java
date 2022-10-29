package questions.questions_3_substring_without_repeating_characters;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("oplakayua"));
    }
    /*
    Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
     */
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            ArrayList<Character> characterArrayList = new ArrayList<Character>();
            int counter = 1;
            List<Integer> lengthArrays = new ArrayList<>();
            characterArrayList.add(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (characterArrayList.contains(s.charAt(i))){
                    lengthArrays.add(counter);
                    counter = 1;
                }
                else{
                    characterArrayList.add(s.charAt(i));
                    counter += 1;

                }

            }
            return Collections.max(lengthArrays);
        }

    }
}
