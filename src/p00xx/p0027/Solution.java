package p00xx.p0027;

// 제목 : Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num != val) {
                nums[i] = val;
                nums[k++] = num;
            }
        }

        return k;
    }
}
