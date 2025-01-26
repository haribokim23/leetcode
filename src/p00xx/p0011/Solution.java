package p00xx.p0011;

// 제목 : Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int maxArea = 0;

        while (leftIndex < rightIndex) {
            int leftValue = height[leftIndex];
            int rightValue = height[rightIndex];
            maxArea = Math.max(maxArea, Math.min(leftValue, rightValue) * (rightIndex - leftIndex));

            if (leftValue < rightValue) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return maxArea;
    }
}
