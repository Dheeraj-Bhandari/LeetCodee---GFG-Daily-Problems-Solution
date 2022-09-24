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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root, targetSum,0, new ArrayList<>());
        return ans;
        
    }
    
    void helper(TreeNode root, int tgt,int runningSum, List<Integer> list){
        if(root==null) return;
        
       int totalSum =  runningSum+root.val;
        list.add(root.val);
        if(root.left==null && root.right==null &&tgt==totalSum){
            System.out.println(list);
            ans.add(list);
            return;
        }
        
        
        helper(root.left, tgt, runningSum+root.val, new ArrayList(list));
        helper(root.right, tgt, runningSum+root.val, new ArrayList(list));
        
        
    }
}