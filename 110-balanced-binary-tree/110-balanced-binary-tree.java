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
    public boolean isBalanced(TreeNode root) {
        return dfs(root)!=-1;
    }
    static int dfs(TreeNode root){
        if(root ==null) return 0;
        
        int left  =dfs(root.left);
        if(left==-1) return -1;
        int right = dfs(root.right);
        if(right==-1) return -1;
        
        if(Math.abs(left-right)>1) return  -1;
        else return Math.max(left, right)+1;
    }
}