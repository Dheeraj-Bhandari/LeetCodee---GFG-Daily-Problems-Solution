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
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean isValid(TreeNode root, long start, long end){
        if(root==null) return true;
        
        if(root.val> start && root.val<end){
             return isValid(root.left, start , root.val) && isValid(root.right,  root.val , end);  
        }
    return false;
    }
}