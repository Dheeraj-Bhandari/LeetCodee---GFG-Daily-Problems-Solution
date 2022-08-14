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
    public List<List<Integer>> levelOrder(TreeNode node) {
      Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(node==null) return ans;
       
        q.add(node);
        while(!q.isEmpty()){
            int size = q.size();
            // TreeNode node =q.pee();
            List<Integer> list = new ArrayList<>();
            while(size-->0){
                 
                TreeNode n = q.remove();
                
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
                list.add(n.val);
            }
            ans.add(list);
        }
        return ans;
        }
    }
