package p00xx.p0088;

// 제목 : Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        int length = m + n;
        int[] temp = new int[length];
        int index1 = 0;
        int index2 = 0;
        int index = 0;

        while (index1 < m && index2 < n) {
            int value1 = nums1[index1];
            int value2 = nums2[index2];

            if (value1 < value2) {
                temp[index++] = value1;
                index1++;
            } else {
                temp[index++] = value2;
                index2++;
            }
        }

        if (index1 < m) {
            System.arraycopy(nums1, index1, temp, index, m - index1);
        } else {
            System.arraycopy(nums2, index2, temp, index, n - index2);
        }

        System.arraycopy(temp, 0, nums1, 0, length);
    }
}
