package p00xx.p0014;

// 제목 : Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = 200;

        for (String s : strs) {
            minLength = Math.min(minLength, s.length());
        }

        int strings = strs.length;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i);
            boolean equal = true;

            for (int j = 1; j < strings; j++) {
                if (strs[j].charAt(i) != c) {
                    equal = false;
                    break;
                }
            }

            if (!equal) {
                break;
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
