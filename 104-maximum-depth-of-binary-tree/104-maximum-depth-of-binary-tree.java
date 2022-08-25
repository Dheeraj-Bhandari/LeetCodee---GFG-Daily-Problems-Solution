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
    
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
       return depth(root, 0);
        
    }
    int depth(TreeNode root, int max){
        if(root==null) return max;
        
        int l = depth(root.left, max);
        int r = depth(root.right, max);
        
        int ans = 0;
        ans = Math.max(l,r);
        return ans+1;
    }
}