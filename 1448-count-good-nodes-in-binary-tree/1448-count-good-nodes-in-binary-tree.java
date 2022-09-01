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
    public int goodNodes(TreeNode root) {
        countGN(root, Integer.MIN_VALUE);
        return ans;
    }
    int ans =0;
    void countGN(TreeNode root, int max){
        if(root==null) return;
        
        if(root.val>=max){
            ans++;
            max = Math.max(root.val, max);
        }
        
        countGN(root.left, max);
        countGN(root.right, max);
        return;
    }
}