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
    public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
       if(r1==null && r2==null) return null;
      
       if(r1==null && r2!=null) return r2;
       if(r2==null && r1!=null) return r1; 
        
        TreeNode node = new TreeNode(r1.val+r2.val);
        
        node.left = mergeTrees(r1.left, r2.left);
        node.right = mergeTrees(r1.right, r2.right);
        return node;
    
        
    }
    
}