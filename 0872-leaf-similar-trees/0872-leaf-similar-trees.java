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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2==null) return false;
        
        List<Integer> list1 = dfs(root1, new ArrayList<Integer>());
         List<Integer> list2 = dfs(root2, new ArrayList<Integer>());
        
        
        // System.out.println(list1);
        // System.out.println(list2);
        return list1.equals(list2);
    }
    
    List<Integer> dfs(TreeNode root, List<Integer> list){
        if(root==null) return list;
        if(root.left==null && root.right==null){
            list.add(root.val);
            return list;
        }
        
        dfs(root.left, list);
        dfs(root.right, list);
        return list;
    }
}