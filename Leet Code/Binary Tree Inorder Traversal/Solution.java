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
import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>[] list = (ArrayList<Integer>[]) Array.newInstance(ArrayList.class,n);
        List<Integer> list = new ArrayList<>();
        addValue(list,root);
        return list;
        String s= "";
        s.
        
    }
    private void addValue(List<Integer> list, TreeNode node){
        if(node==null){
            return;
        }
        addValue(list,node.left);
        list.add(node.val);
        addValue(list,node.right);
    }
}