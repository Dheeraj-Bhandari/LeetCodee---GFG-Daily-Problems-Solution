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
    long totalsum = 0;
    long maxProd = 0;
    public int maxProduct(TreeNode root) {
        dfs(root);
        subTreeSum(root);
        return (int)(maxProd % ((int)Math.pow(10,9)+7));
    }
    
    void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        dfs(root.right);
        
        totalsum+= (long)root.val;
    }
    
     long subTreeSum(TreeNode root){
         if(root==null) return 0;
         long l = subTreeSum(root.left);
         long r = subTreeSum(root.right);
         long subSum = l+r+root.val;
         
         maxProd = Math.max(maxProd, (subSum)*(totalsum-subSum));
         return subSum;
     }
}