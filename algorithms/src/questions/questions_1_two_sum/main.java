package questions.questions_1_two_sum;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {2,7,11,15};

        System.out.println(solution.twoSum(array,9));
    }
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; map.put(nums[i], ++i))
                if (map.containsKey(target - nums[i]))
                    return new int[]{map.get(target - nums[i]),i+1};
            return new int[]{0,0};
        }
    }
}
