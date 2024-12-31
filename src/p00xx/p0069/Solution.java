package p00xx.p0069;

// 제목 : Sqrt(x)

class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int start = 1;
        int end = x;

        while (start <= end) {
            int middle = (start + end) / 2;
            int quotient = x / middle;

            if (quotient == middle) {
                return middle;
            } else if (quotient < middle) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return x / start < x ? start - 1 : start;
    }
}
