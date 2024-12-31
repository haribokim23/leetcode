package p00xx.p0045;

// 제목 : Jump Game II

class Solution {
    public int jump(int[] nums) {
        int length = nums.length;
        int[] jumps = new int[length];

        for (int i = 0, start = 1; i < length - 1; i++) {
            int nextJump = jumps[i] + 1;
            int nextStart = 0;

            for (int j = start; j <= i + nums[i]; j++) {
                if (j >= length) {
                    break;
                }

                int currentJump = jumps[j];

                if (currentJump == 0 || currentJump > nextJump) {
                    jumps[j] = nextJump;
                    nextStart = j;
                }
            }

            if (jumps[length - 1] != 0) {
                break;
            }

            start = Math.max(start, nextStart);
        }

        return jumps[length - 1];
    }
}
