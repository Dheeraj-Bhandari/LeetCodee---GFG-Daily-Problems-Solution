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
    int diff = 0;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return diff;
        
        maxDiffHelper(root);
        
        return diff;
      
    }
    
    int[] maxDiffHelper(TreeNode root){
        if(root==null)return new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};
        
        int[] left = maxDiffHelper(root.left);
        int[] right = maxDiffHelper(root.right);
        
        int leftmin = left[0];
        int rightmin = right[0];
        
        int min = Math.min(root.val, Math.min(leftmin, rightmin));
        
        int leftmax = left[1];
        int rightmax = right[1];
        
        int max = Math.max(root.val, Math.max(leftmax, rightmax));
        
        diff = Math.max((max-root.val), Math.max((root.val-min), diff));
        
        return new int[]{min, max};
        
    }
}