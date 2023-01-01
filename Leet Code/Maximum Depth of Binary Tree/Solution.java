/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int max = 0;
    public int maxDepth(TreeNode root) {
        findMax(root, 1);
        return max;
    }

    private void findMax(TreeNode root, int n) {
        if(root == null) {
            return;
        }
        if(root.left != null) {
            findMax(root.left, n+1);
        }
        if(root.right != null) {
            findMax(root.right, n+1);
        }
        if(max < n) {
            max = n;
            return;
        }
    }
}