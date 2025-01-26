package p00xx.p0013;

// 제목 : Roman to Integer

class Solution {
    public int romanToInt(String s) {
        int[] values = new int['X' + 1];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int temp = 0;
        int sum = 0;

        for (int i = 0, prev = 1000; i < s.length(); i++) {
            int value = values[s.charAt(i)];

            if (value == prev) {
                temp += value;
            } else {
                if (value < prev) {
                    sum += temp;
                } else {
                    sum -= temp;
                }

                temp = value;
            }

            prev = value;
        }

        return sum + temp;
    }
}
