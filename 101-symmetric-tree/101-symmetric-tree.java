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
    public boolean isSymmetric(TreeNode root) {
        // if(root.left.val == root.right.val || root.right.val== root.left.val) return true;
        // if(root.left==null && root.right!=null || root.right==null && root.left!=null) return false;
        return func(root.left , root.right);
        
    }
    boolean func(TreeNode left, TreeNode right){
         if(left==null || right==null) return left==right;
        
        if(left.val != right.val) return false;
        
        boolean leftt = func(left.left, right.right);
        boolean rightt= func(left.right, right.left);
        return leftt && rightt;
    }
}