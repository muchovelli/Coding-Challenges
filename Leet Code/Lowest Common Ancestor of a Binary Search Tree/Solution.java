/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private Stack<TreeNode> pAncestors = new Stack<>();
    private Stack<TreeNode> qAncestors = new Stack<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        findAncestors(root, p, pAncestors);
        findAncestors(root, q, qAncestors);

        return findLCA();
    }

    private void findAncestors(TreeNode root, TreeNode child, Stack<TreeNode> ancestors) {
        TreeNode currentNode = root;
        while(currentNode != null) {
            ancestors.add(currentNode);
            if(currentNode == child) {
                return;
            }
            if(currentNode.val > child.val) {
                currentNode = currentNode.left;
            }else {
                currentNode = currentNode.right;
            }
        }
    }

    private TreeNode findLCA() {
        for(int i = pAncestors.size() - 1; i >= 0; i--) {
            if(qAncestors.contains(pAncestors.get(i))){
                return pAncestors.get(i);
            }
        }
        return null;
    }
}