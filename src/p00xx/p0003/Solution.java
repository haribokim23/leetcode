package p00xx.p0003;

// 제목 : Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();

        if (length <= 1) {
            return length;
        }

        int[] count = new int[128];
        int start = 0;
        int end = 0;
        int max = 0;

        while (end < length) {
            char c = s.charAt(end);

            if (count[c] == 0) {
                count[c]++;
                max = Math.max(max, ++end - start);
            } else {
                count[s.charAt(start++)]--;
            }
        }

        return max;
    }
}
