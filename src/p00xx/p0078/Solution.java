package p00xx.p0078;

// 제목 : Subsets

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int number : nums) {
            int size = subsets.size();

            for (int i = 0; i < size; i++) {
                List<Integer> nextSubset = new ArrayList<>(subsets.get(i));
                nextSubset.add(number);
                subsets.add(nextSubset);
            }
        }

        return subsets;
    }
}
