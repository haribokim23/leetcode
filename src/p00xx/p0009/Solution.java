package p00xx.p0009;

// 제목 : Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        int reversed = 0;

        for (int copy = x; copy > 0; ) {
            reversed = reversed * 10 + copy % 10;
            copy /= 10;
        }

        return x == reversed;
    }
}
