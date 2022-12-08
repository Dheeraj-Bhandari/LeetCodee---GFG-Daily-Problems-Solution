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
    int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        
         
        
        checkdfs(root, high , low);
        
        return ans;
    }
    
  
    void checkdfs(TreeNode root, int high, int low){
        if(root==null) return;
        
        if(root.val<=high && root.val>=low){
            ans = ans + root.val;
            // System.out.println(root.val);
        }
        if(root.val > low)checkdfs(root.left, high, low);
       if(root.val < high) checkdfs(root.right, high, low);
        // return ans;
    }
}