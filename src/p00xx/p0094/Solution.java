package p00xx.p0094;

// 제목 : Binary Tree Inorder Traversal

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();

        if (root != null) {
            if (root.left != null) {
                values.addAll(inorderTraversal(root.left));
            }

            values.add(root.val);

            if (root.right != null) {
                values.addAll(inorderTraversal(root.right));
            }
        }

        return values;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
