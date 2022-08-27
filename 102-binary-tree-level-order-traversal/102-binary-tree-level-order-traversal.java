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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue  = new ArrayDeque<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        queue.offer(root);
        while(queue.size()>0){
            int size = queue.size();
            List<Integer> ans = new ArrayList<>();
            while(size-->0){
               TreeNode node = queue.poll();
                ans.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            list.add(ans);
            
        }
        return list;
        
    }
}