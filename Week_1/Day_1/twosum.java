import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> seen = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int need = target - nums[index];

            Integer pos = seen.get(need);
            if (pos != null) {
                return new int[]{pos, index};
            }

            seen.put(nums[index], index);
        }

        return new int[0];

        
    }
}
