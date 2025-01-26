package p00xx.p0066;

// 제목 : Plus One

class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length - 1; i >= 0; i--) {
            int digit = digits[i];
            digits[i] = (digit + 1) % 10;

            if (digit != 9) {
                break;
            }
        }

        int[] temp = new int[length + 1];
        temp[0] = 1;

        if (digits[0] == 0) {
            System.arraycopy(digits, 0, temp, 1, length);
            digits = temp;
        }

        return digits;
    }
}
