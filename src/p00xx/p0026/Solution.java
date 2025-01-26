package p00xx.p0026;

// 제목 : Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1, prev = nums[0]; i < nums.length; i++) {
            int num = nums[i];

            if (num > prev) {
                nums[k++] = num;
                prev = num;
            }
        }

        return k;
    }
}
