package p00xx.p0058;

// 제목 : Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
        String[] strings = s.split("\\s");
        return strings[strings.length - 1].length();
    }
}
