package p00xx.p0001;

// 제목 : Two Sum

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int number = nums[index];
            int difference = target - number;

            if (hm.containsKey(difference)) {
                return new int[]{hm.get(difference), index};
            }

            hm.put(number, index);
        }

        return null;
    }
}
