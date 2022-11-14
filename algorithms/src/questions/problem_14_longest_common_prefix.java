package questions;

import java.util.ArrayList;
import java.util.Collections;

public class problem_14_longest_common_prefix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    /*
    Input: strs = ["flower","flow","flight"]
Output: "fl"
     */
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            int count = 0;
            int firstArrayIndex = 0;
            int maxIndex = strs[0].length();
            ArrayList<Integer> counts = new ArrayList<Integer>();
            for (int i = 0; i < strs.length; i++) {
                if (maxIndex > strs[i].length()){
                    maxIndex = strs[i].length() - 1;
                }
                if (strs[i].length() == 1){
                    maxIndex = 1;
                }if (strs[i].length() == 2){
                    maxIndex = 2;
                }
            }
            for (int i = 1; i < strs.length; i++) {
                for (int j = 0; j < maxIndex; j++) {
                    if (strs[firstArrayIndex].charAt(j) == strs[i].charAt(j)){
                        count+=1;
                    }
                }
                counts.add(count);
                count = 0;
            }
            int arrayCountsIndex = Collections.min(counts);
            String getChar = strs[0].substring(0,arrayCountsIndex);
            return getChar;
        }
    }
}
