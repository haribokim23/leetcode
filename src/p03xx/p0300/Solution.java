package p03xx.p0300;

// 제목 : Longest Increasing Subsequence

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] minValues = new int[nums.length + 1];
        minValues[1] = 10000;
        int maxLength = 1;

        for (int value : nums) {
            if (value <= minValues[1]) {
                minValues[1] = value;
                continue;
            }

            int lastMinValue = minValues[maxLength];

            if (value == lastMinValue) {
                continue;
            }

            if (value > lastMinValue) {
                minValues[++maxLength] = value;
                continue;
            }

            int length = 1;

            for (int last = maxLength - 1; length <= last; ) {
                int middle = (length + last) / 2;
                int middleValue = minValues[middle];

                if (value == middleValue) {
                    length = middle;
                    break;
                }

                if (value > middleValue) {
                    length = middle + 1;
                } else {
                    last = middle - 1;
                }
            }

            if (value < minValues[length]) {
                minValues[length] = value;
            }
        }

        return maxLength;
    }
}
