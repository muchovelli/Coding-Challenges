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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            return false;
        }else if(isTheSameTree(root, subRoot)) {
            return true;
        }else{
            return isSubtree(root.left, subRoot) || isTheSameTree(root.right, subRoot);
        }
    }

    public boolean isTheSameTree(TreeNode root, TreeNode subtree) {
        if(root == null || subtree == null) {
            return root==null && subtree == null;
        }else if(root.val == subtree.val) {
            return isTheSameTree(root.left, subtree.left) && isTheSameTree(root.right, subtree.right);
        }else {
            return false;
        }
    }
}