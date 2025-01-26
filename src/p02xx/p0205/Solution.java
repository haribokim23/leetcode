package p02xx.p0205;

// 제목 : Isomorphic Strings

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        boolean isIsomorphic = true;

        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);

            if (!hm.containsKey(si)) {
                if (hm.containsValue(ti)) {
                    isIsomorphic = false;
                    break;
                }

                hm.put(si, ti);
                continue;
            }

            if (hm.get(si) != ti) {
                isIsomorphic = false;
                break;
            }
        }

        return isIsomorphic;
    }
}
