package p00xx.p0070;

// 제목 : Climbing Stairs

class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;

        while (n-- > 1) {
            b += a;
            a = b - a;
        }

        return b;
    }
}
