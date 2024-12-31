package p00xx.p0035;

// 제목 : Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            int num = nums[middle];

            if (num == target) {
                return middle;
            } else if (num < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return start;
    }
}
